.class public Lcom/tencent/mm/opensdk/modelmsg/WXAppLaunchData$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/mm/opensdk/modelmsg/WXAppLaunchData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fromBundle(Landroid/os/Bundle;)Lcom/tencent/mm/opensdk/modelmsg/WXAppLaunchData;
    .locals 2

    new-instance v1, Lcom/tencent/mm/opensdk/modelmsg/WXAppLaunchData;

    invoke-direct {v1}, Lcom/tencent/mm/opensdk/modelmsg/WXAppLaunchData;-><init>()V

    const-string v0, "_wxapplaunchdata_launchType"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, Lcom/tencent/mm/opensdk/modelmsg/WXAppLaunchData;->launchType:I

    const-string v0, "_wxapplaunchdata_message"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/tencent/mm/opensdk/modelmsg/WXAppLaunchData;->message:Ljava/lang/String;

    return-object v1
.end method

.method public static toBundle(Lcom/tencent/mm/opensdk/modelmsg/WXAppLaunchData;)Landroid/os/Bundle;
    .locals 3

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "_wxapplaunchdata_launchType"

    iget v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXAppLaunchData;->launchType:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "_wxapplaunchdata_message"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXAppLaunchData;->message:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method
