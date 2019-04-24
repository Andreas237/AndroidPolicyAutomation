package com.shopkick.app.store

import android.os.CountDownTimer
import android.widget.TextView
import java.lang.ref.WeakReference
import java.util.*
import java.util.concurrent.TimeUnit

class CountdownTimerController {
    var timer: BonusCountdownTimer? = null
    val daysCounter: WeakReference<TextView>
    val hoursCounter: WeakReference<TextView>
    val minsCounter: WeakReference<TextView>
    val secsCounter: WeakReference<TextView>
    val coundownTimerCallback: WeakReference<ICountdownTimerFinished>
    var expiryTs: Long = -1

    constructor(coundownTimerCallback: ICountdownTimerFinished, daysCounter: TextView, hoursCounter: TextView, minsCounter: TextView, secsCounter: TextView) {
        this.daysCounter = WeakReference<TextView>(daysCounter)
        this.hoursCounter = WeakReference<TextView>(hoursCounter)
        this.minsCounter = WeakReference<TextView>(minsCounter)
        this.secsCounter = WeakReference<TextView>(secsCounter)
        this.coundownTimerCallback = WeakReference<ICountdownTimerFinished>(coundownTimerCallback)
    }

    public fun start(expiryTs: Long) {
        this.expiryTs = expiryTs

        if (timer == null) {
            var timeLeft: Long = expiryTs - System.currentTimeMillis();
            timeLeft = if (timeLeft < 0) 0 else timeLeft;
            timer = BonusCountdownTimer(timeLeft, 1000, this)
            timer?.start();
        }
    }

    public fun stop() {
        timer?.cancel();
        timer = null;
    }

    public fun clear() {
        stop();
        expiryTs = Long.MIN_VALUE
    }

    private fun onTick(millisUntilFinished: Long) {
        val days: Long = TimeUnit.MILLISECONDS.toDays(millisUntilFinished)
        val hours: Long = TimeUnit.MILLISECONDS.toHours(millisUntilFinished) - TimeUnit.DAYS.toHours(days)
        val mins: Long = TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.DAYS.toMinutes(days)-
                TimeUnit.HOURS.toMinutes(hours)
        val secs: Long = TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.DAYS.toSeconds(days)-
                TimeUnit.HOURS.toSeconds(hours) - TimeUnit.MINUTES.toSeconds(mins)
        setCounterValues(days, hours, mins, secs)

    }

    private fun onFinish() {
        setCounterValues(0, 0, 0, 0)
        coundownTimerCallback?.get()?.onCountdownTimerFinished()
        clear()
    }

    private fun setCounterValues(days: Long, hours: Long, mins: Long, secs: Long) {
        daysCounter?.get()?.setText(String.format(Locale.getDefault(), "%02d", days));
        hoursCounter?.get()?.setText(String.format(Locale.getDefault(), "%02d", hours));
        minsCounter?.get()?.setText(String.format(Locale.getDefault(), "%02d", mins));
        secsCounter?.get()?.setText(String.format(Locale.getDefault(), "%02d", secs));
    }

    class BonusCountdownTimer(millisInFuture: Long, countDownInterval: Long) : CountDownTimer(millisInFuture, countDownInterval) {
        lateinit var timerControllerRef: WeakReference<CountdownTimerController>

        constructor(millisInFuture: Long, countDownInterval: Long, timerController: CountdownTimerController) : this(millisInFuture, countDownInterval) {
            timerControllerRef = WeakReference<CountdownTimerController>(timerController)

        }

        override fun onFinish() {
            timerControllerRef?.get()?.onFinish()
        }

        override fun onTick(millisUntilFinished: Long) {
            timerControllerRef?.get()?.onTick(millisUntilFinished) ?: cancel()
        }
    }
}
