.class public Lcom/shopkick/app/telephony/SKTelephonyManager;
.super Ljava/lang/Object;
.source "SKTelephonyManager.java"


# instance fields
.field private alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private telephonyManager:Landroid/telephony/TelephonyManager;


# direct methods
.method public constructor <init>(Landroid/telephony/TelephonyManager;Lcom/shopkick/app/application/dialog/DialogsManager;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/shopkick/app/telephony/SKTelephonyManager;->telephonyManager:Landroid/telephony/TelephonyManager;

    .line 18
    iput-object p2, p0, Lcom/shopkick/app/telephony/SKTelephonyManager;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-void
.end method


# virtual methods
.method public getCallState()I
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/shopkick/app/telephony/SKTelephonyManager;->telephonyManager:Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_0

    .line 29
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getCallState()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public listen(Landroid/telephony/PhoneStateListener;I)V
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/shopkick/app/telephony/SKTelephonyManager;->telephonyManager:Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_0

    .line 23
    invoke-virtual {v0, p1, p2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    :cond_0
    return-void
.end method
