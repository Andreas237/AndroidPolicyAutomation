.class public final Lcom/huawei/hms/support/log/HMSDebugger;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static init(Landroid/content/Context;I)V
    .locals 1

    .line 16
    const-string v0, "HMSSdk"

    invoke-static {p0, p1, v0}, Lcom/huawei/hms/support/log/a;->a(Landroid/content/Context;ILjava/lang/String;)V

    .line 17
    return-void
.end method
