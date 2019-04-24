.class Lio/branch/referral/InstallListener$ReferrerClientWrapper$1;
.super Ljava/lang/Object;
.source "InstallListener.java"

# interfaces
.implements Lcom/android/installreferrer/api/InstallReferrerStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/branch/referral/InstallListener$ReferrerClientWrapper;->getReferrerUsingReferrerClient()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/branch/referral/InstallListener$ReferrerClientWrapper;


# direct methods
.method constructor <init>(Lio/branch/referral/InstallListener$ReferrerClientWrapper;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lio/branch/referral/InstallListener$ReferrerClientWrapper$1;->this$0:Lio/branch/referral/InstallListener$ReferrerClientWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInstallReferrerServiceDisconnected()V
    .locals 0

    .line 140
    invoke-static {}, Lio/branch/referral/InstallListener;->access$600()V

    return-void
.end method

.method public onInstallReferrerSetupFinished(I)V
    .locals 6

    packed-switch p1, :pswitch_data_0

    goto :goto_1

    .line 129
    :pswitch_0
    invoke-static {}, Lio/branch/referral/InstallListener;->access$600()V

    goto :goto_1

    .line 133
    :pswitch_1
    invoke-static {}, Lio/branch/referral/InstallListener;->access$600()V

    goto :goto_1

    .line 110
    :pswitch_2
    :try_start_0
    iget-object p1, p0, Lio/branch/referral/InstallListener$ReferrerClientWrapper$1;->this$0:Lio/branch/referral/InstallListener$ReferrerClientWrapper;

    invoke-static {p1}, Lio/branch/referral/InstallListener$ReferrerClientWrapper;->access$300(Lio/branch/referral/InstallListener$ReferrerClientWrapper;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 111
    iget-object p1, p0, Lio/branch/referral/InstallListener$ReferrerClientWrapper$1;->this$0:Lio/branch/referral/InstallListener$ReferrerClientWrapper;

    invoke-static {p1}, Lio/branch/referral/InstallListener$ReferrerClientWrapper;->access$300(Lio/branch/referral/InstallListener$ReferrerClientWrapper;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/installreferrer/api/InstallReferrerClient;

    invoke-virtual {p1}, Lcom/android/installreferrer/api/InstallReferrerClient;->getInstallReferrer()Lcom/android/installreferrer/api/ReferrerDetails;

    move-result-object p1

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    if-eqz p1, :cond_0

    .line 116
    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getInstallReferrer()Ljava/lang/String;

    move-result-object v0

    .line 117
    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getReferrerClickTimestampSeconds()J

    move-result-wide v1

    .line 118
    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getInstallBeginTimestampSeconds()J

    move-result-wide v3

    move-wide v4, v3

    move-wide v2, v1

    move-object v1, v0

    goto :goto_0

    :cond_0
    move-wide v4, v1

    move-object v1, v0

    move-wide v2, v4

    .line 120
    :goto_0
    iget-object p1, p0, Lio/branch/referral/InstallListener$ReferrerClientWrapper$1;->this$0:Lio/branch/referral/InstallListener$ReferrerClientWrapper;

    invoke-static {p1}, Lio/branch/referral/InstallListener$ReferrerClientWrapper;->access$400(Lio/branch/referral/InstallListener$ReferrerClientWrapper;)Landroid/content/Context;

    move-result-object v0

    invoke-static/range {v0 .. v5}, Lio/branch/referral/InstallListener;->access$500(Landroid/content/Context;Ljava/lang/String;JJ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string v0, "BranchSDK"

    .line 123
    invoke-virtual {p1}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    invoke-static {}, Lio/branch/referral/InstallListener;->access$600()V

    :cond_1
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
