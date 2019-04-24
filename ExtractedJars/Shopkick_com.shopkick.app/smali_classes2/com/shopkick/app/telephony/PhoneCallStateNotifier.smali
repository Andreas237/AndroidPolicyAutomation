.class public Lcom/shopkick/app/telephony/PhoneCallStateNotifier;
.super Landroid/telephony/PhoneStateListener;
.source "PhoneCallStateNotifier.java"


# instance fields
.field private listeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/telephony/IPhoneCallStateCallback;",
            ">;"
        }
    .end annotation
.end field

.field private started:Z

.field private telephonyManager:Lcom/shopkick/app/telephony/SKTelephonyManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/telephony/SKTelephonyManager;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->started:Z

    .line 18
    iput-object p1, p0, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->telephonyManager:Lcom/shopkick/app/telephony/SKTelephonyManager;

    .line 19
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->listeners:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public getCallState()I
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->telephonyManager:Lcom/shopkick/app/telephony/SKTelephonyManager;

    if-eqz v0, :cond_0

    .line 57
    invoke-virtual {v0}, Lcom/shopkick/app/telephony/SKTelephonyManager;->getCallState()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public hasStarted()Z
    .locals 1

    .line 38
    iget-boolean v0, p0, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->started:Z

    return v0
.end method

.method public onCallStateChanged(ILjava/lang/String;)V
    .locals 1

    .line 84
    iget-boolean p2, p0, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->started:Z

    if-nez p2, :cond_0

    return-void

    .line 88
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->listeners:Ljava/util/ArrayList;

    if-eqz p2, :cond_1

    .line 89
    invoke-virtual {p2}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    .line 90
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/telephony/IPhoneCallStateCallback;

    .line 91
    invoke-interface {v0, p1}, Lcom/shopkick/app/telephony/IPhoneCallStateCallback;->onPhoneCallStateChanged(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public registerListener(Lcom/shopkick/app/telephony/IPhoneCallStateCallback;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->listeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public start()V
    .locals 2

    .line 26
    iget-boolean v0, p0, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->started:Z

    if-eqz v0, :cond_0

    return-void

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->telephonyManager:Lcom/shopkick/app/telephony/SKTelephonyManager;

    if-eqz v0, :cond_1

    const/16 v1, 0x20

    .line 31
    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/telephony/SKTelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    :cond_1
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->started:Z

    return-void
.end method

.method public stop()V
    .locals 2

    .line 45
    iget-boolean v0, p0, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->started:Z

    if-nez v0, :cond_0

    return-void

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->telephonyManager:Lcom/shopkick/app/telephony/SKTelephonyManager;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/telephony/SKTelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 52
    iput-boolean v1, p0, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->started:Z

    return-void
.end method

.method public unregisterListener(Lcom/shopkick/app/telephony/IPhoneCallStateCallback;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 74
    iget-object v0, p0, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->listeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
