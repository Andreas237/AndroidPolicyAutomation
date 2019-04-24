.class public Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiLengthHandler;,
        Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiViewHandler;,
        Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$SimViewHandler;,
        Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiHandler;
    }
.end annotation


# static fields
.field public static final FIRST_SIM_SLOT:I = 0x0

.field public static final SECOND_SIM_SLOT:I = 0x1

.field private static final WIFI_LENGTH_FOUR:I = 0x4

.field private static final WIFI_LENGTH_ONE:I = 0x1

.field private static final WIFI_LENGTH_THREE:I = 0x3

.field private static final WIFI_LENGTH_TWO:I = 0x2

.field private static final WIFI_LENGTH_ZERO:I = 0x0


# instance fields
.field private mIsRegister:Z

.field private mPhoneStateListener:Landroid/telephony/PhoneStateListener;

.field private mSimActivity:I

.field private mSimConnected:Landroid/widget/ImageView;

.field private mSimLayout:Landroid/widget/FrameLayout;

.field mSimViewHandler:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$SimViewHandler;

.field private mWifiActivity:I

.field private mWifiChannel:Ljava/lang/Object;

.field private mWifiConnected:Landroid/widget/ImageView;

.field private mWifiLayout:Landroid/widget/FrameLayout;

.field mWifiLengthHandler:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiLengthHandler;

.field private mWifiManager:Landroid/net/wifi/WifiManager;

.field mWifiViewHandler:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiViewHandler;

.field private mWifisignal:Landroid/widget/ImageView;

.field private netContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 65
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mIsRegister:Z

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mSimActivity:I

    .line 37
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiActivity:I

    .line 66
    iput-object p1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->netContext:Landroid/content/Context;

    .line 68
    new-instance v0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$1;

    invoke-direct {v0, p0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$1;-><init>(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)V

    iput-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mPhoneStateListener:Landroid/telephony/PhoneStateListener;

    .line 78
    const-string v0, "phone"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    iget-object v1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mPhoneStateListener:Landroid/telephony/PhoneStateListener;

    const/16 v2, 0x80

    invoke-virtual {v0, v1, v2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 81
    invoke-direct {p0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->createWifiHandler()V

    .line 82
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)I
    .locals 1

    .line 23
    iget v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mSimActivity:I

    return v0
.end method

.method static synthetic access$002(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;I)I
    .locals 0

    .line 23
    iput p1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mSimActivity:I

    return p1
.end method

.method static synthetic access$100(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)Ljava/lang/Object;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiChannel:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)Landroid/net/wifi/WifiManager;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiManager:Landroid/net/wifi/WifiManager;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)I
    .locals 1

    .line 23
    iget v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiActivity:I

    return v0
.end method

.method static synthetic access$302(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;I)I
    .locals 0

    .line 23
    iput p1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiActivity:I

    return p1
.end method

.method static synthetic access$400(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;Landroid/os/Message;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->handlerSimViewMsg(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;Landroid/os/Message;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->handlerWifiViewMsg(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;Landroid/os/Message;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->handlerWifiLengthMsg(Landroid/os/Message;)V

    return-void
.end method

.method private createWifiHandler()V
    .locals 8

    .line 124
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->netContext:Landroid/content/Context;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    iput-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiManager:Landroid/net/wifi/WifiManager;

    .line 125
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiManager:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "DATA_ACTIVITY_NONE"

    invoke-static {v0, v1}, Lcom/huawei/pay/ui/oobe/widget/ReflectionNetStatusHelper;->getFieldInt(Ljava/lang/Class;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiActivity:I

    .line 127
    new-instance v5, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiHandler;

    invoke-direct {v5, p0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiHandler;-><init>(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)V

    .line 128
    const-string v0, "com.android.internal.util.AsyncChannel"

    invoke-static {v0}, Lcom/huawei/wallet/utils/ReflectionUtils;->b(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiChannel:Ljava/lang/Object;

    .line 130
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiManager:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getWifiServiceMessenger"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-static {v0, v1, v2}, Lcom/huawei/pay/ui/oobe/widget/ReflectionNetStatusHelper;->getMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 131
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiManager:Landroid/net/wifi/WifiManager;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v6, v1}, Lcom/huawei/pay/ui/oobe/widget/ReflectionNetStatusHelper;->invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/os/Messenger;

    .line 133
    if-eqz v7, :cond_0

    .line 134
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiChannel:Ljava/lang/Object;

    const-string v1, "connect"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->netContext:Landroid/content/Context;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v5, v2, v3

    const/4 v3, 0x2

    aput-object v7, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/ReflectionUtils;->b(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 136
    :cond_0
    const-string v0, "wifiMessenger is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 138
    :goto_0
    return-void
.end method

.method private handlerSimViewMsg(Landroid/os/Message;)V
    .locals 2

    .line 191
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 193
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mSimConnected:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->stat_sys_signal_in_sim:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 194
    goto :goto_0

    .line 196
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mSimConnected:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->stat_sys_signal_out_sim:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 197
    goto :goto_0

    .line 199
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mSimConnected:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->stat_sys_signal_inout_sim:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 200
    goto :goto_0

    .line 202
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mSimConnected:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 203
    .line 207
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private handlerWifiLengthMsg(Landroid/os/Message;)V
    .locals 2

    .line 254
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 256
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifisignal:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->stat_sys_wifi_signal_0:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 257
    goto :goto_1

    .line 259
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifisignal:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->stat_sys_wifi_signal_1:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 260
    goto :goto_1

    .line 262
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifisignal:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->stat_sys_wifi_signal_2:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 263
    goto :goto_1

    .line 265
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifisignal:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->stat_sys_wifi_signal_3:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 266
    goto :goto_1

    .line 268
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifisignal:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->stat_sys_wifi_signal_4:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 269
    goto :goto_1

    .line 271
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleMessage msg.what = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->what:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 272
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifisignal:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->stat_sys_wifi_signal_0:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 275
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private handlerWifiViewMsg(Landroid/os/Message;)V
    .locals 3

    .line 226
    iget v0, p1, Landroid/os/Message;->what:I

    iget-object v1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiManager:Landroid/net/wifi/WifiManager;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "DATA_ACTIVITY_IN"

    invoke-static {v1, v2}, Lcom/huawei/pay/ui/oobe/widget/ReflectionNetStatusHelper;->getFieldInt(Ljava/lang/Class;Ljava/lang/String;)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 227
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiConnected:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->stat_sys_signal_in:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 228
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    iget-object v1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiManager:Landroid/net/wifi/WifiManager;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "DATA_ACTIVITY_OUT"

    invoke-static {v1, v2}, Lcom/huawei/pay/ui/oobe/widget/ReflectionNetStatusHelper;->getFieldInt(Ljava/lang/Class;Ljava/lang/String;)I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 229
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiConnected:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->stat_sys_signal_out:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 230
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    iget-object v1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiManager:Landroid/net/wifi/WifiManager;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "DATA_ACTIVITY_INOUT"

    invoke-static {v1, v2}, Lcom/huawei/pay/ui/oobe/widget/ReflectionNetStatusHelper;->getFieldInt(Ljava/lang/Class;Ljava/lang/String;)I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 231
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiConnected:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->stat_sys_signal_inout:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 232
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    iget-object v1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiManager:Landroid/net/wifi/WifiManager;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "DATA_ACTIVITY_NONE"

    invoke-static {v1, v2}, Lcom/huawei/pay/ui/oobe/widget/ReflectionNetStatusHelper;->getFieldInt(Ljava/lang/Class;Ljava/lang/String;)I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 233
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiConnected:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 235
    :cond_3
    :goto_0
    return-void
.end method

.method private isSimCardsExits()Z
    .locals 11

    .line 141
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->netContext:Landroid/content/Context;

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/telephony/TelephonyManager;

    .line 144
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->hasIccCard()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 145
    const/4 v0, 0x1

    return v0

    .line 149
    :cond_0
    const-string v0, "com.huawei.telephony.HuaweiTelephonyManager"

    invoke-static {v0}, Lcom/huawei/pay/ui/oobe/widget/ReflectionNetStatusHelper;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    .line 150
    const-string v0, "getDefault"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-static {v5, v0, v1}, Lcom/huawei/pay/ui/oobe/widget/ReflectionNetStatusHelper;->getMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 151
    const-string v0, "isCardPresent"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5, v0, v1}, Lcom/huawei/pay/ui/oobe/widget/ReflectionNetStatusHelper;->getMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 153
    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1, v6, v0}, Lcom/huawei/pay/ui/oobe/widget/ReflectionNetStatusHelper;->invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 154
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v8, v7, v0}, Lcom/huawei/pay/ui/oobe/widget/ReflectionNetStatusHelper;->invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    .line 155
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v8, v7, v0}, Lcom/huawei/pay/ui/oobe/widget/ReflectionNetStatusHelper;->invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v10

    .line 156
    if-nez v9, :cond_1

    if-eqz v10, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 157
    :catch_0
    move-exception v8

    .line 158
    const/4 v0, 0x0

    return v0
.end method

.method private registerBroadcast()V
    .locals 1

    .line 316
    iget-boolean v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mIsRegister:Z

    if-nez v0, :cond_0

    .line 317
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mIsRegister:Z

    .line 319
    :cond_0
    return-void
.end method

.method private unregisterBroadcast()V
    .locals 1

    .line 322
    iget-boolean v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mIsRegister:Z

    if-eqz v0, :cond_0

    .line 323
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mIsRegister:Z

    .line 325
    :cond_0
    return-void
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .locals 0

    .line 279
    invoke-super {p0}, Landroid/widget/LinearLayout;->onAttachedToWindow()V

    .line 280
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 3

    .line 284
    invoke-super {p0}, Landroid/widget/LinearLayout;->onDetachedFromWindow()V

    .line 285
    invoke-direct {p0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->unregisterBroadcast()V

    .line 286
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->netContext:Landroid/content/Context;

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    iget-object v1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mPhoneStateListener:Landroid/telephony/PhoneStateListener;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 288
    return-void
.end method

.method protected onFinishInflate()V
    .locals 2

    .line 292
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    .line 293
    sget v0, Lcom/huawei/paycommonbase/R$id;->sim_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mSimLayout:Landroid/widget/FrameLayout;

    .line 294
    sget v0, Lcom/huawei/paycommonbase/R$id;->wifi_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiLayout:Landroid/widget/FrameLayout;

    .line 296
    sget v0, Lcom/huawei/paycommonbase/R$id;->sim_connected:I

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mSimConnected:Landroid/widget/ImageView;

    .line 297
    sget v0, Lcom/huawei/paycommonbase/R$id;->wifi_connected:I

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiConnected:Landroid/widget/ImageView;

    .line 299
    sget v0, Lcom/huawei/paycommonbase/R$id;->wifi_signal:I

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifisignal:Landroid/widget/ImageView;

    .line 302
    invoke-direct {p0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->isSimCardsExits()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mSimLayout:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0

    .line 305
    :cond_0
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mSimLayout:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 307
    :goto_0
    invoke-direct {p0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->registerBroadcast()V

    .line 308
    return-void
.end method

.method public refreshNetStatusBar()V
    .locals 1

    .line 85
    iget v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiActivity:I

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->refreshWifiViews(I)V

    .line 86
    iget v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mSimActivity:I

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->refreshSimViews(I)V

    .line 87
    return-void
.end method

.method protected refreshSimViews(I)V
    .locals 2

    .line 169
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mSimConnected:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 170
    new-instance v0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$SimViewHandler;

    invoke-direct {v0, p0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$SimViewHandler;-><init>(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)V

    iput-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mSimViewHandler:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$SimViewHandler;

    .line 171
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mSimViewHandler:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$SimViewHandler;

    invoke-virtual {v0, p1}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$SimViewHandler;->sendEmptyMessage(I)Z

    .line 172
    return-void
.end method

.method public refreshWifiViews(I)V
    .locals 2

    .line 163
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiConnected:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 164
    new-instance v0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiViewHandler;

    invoke-direct {v0, p0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiViewHandler;-><init>(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)V

    iput-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiViewHandler:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiViewHandler;

    .line 165
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiViewHandler:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiViewHandler;

    invoke-virtual {v0, p1}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiViewHandler;->sendEmptyMessage(I)Z

    .line 166
    return-void
.end method

.method protected setWifiLength(I)V
    .locals 2

    .line 311
    new-instance v0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiLengthHandler;

    invoke-direct {v0, p0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiLengthHandler;-><init>(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)V

    iput-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiLengthHandler:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiLengthHandler;

    .line 312
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->mWifiLengthHandler:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiLengthHandler;

    div-int/lit8 v1, p1, -0x14

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiLengthHandler;->sendEmptyMessage(I)Z

    .line 313
    return-void
.end method
