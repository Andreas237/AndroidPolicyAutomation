.class public abstract Lcom/huawei/hms/b/f;
.super Lcom/huawei/hms/b/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/huawei/hms/b/a;-><init>()V

    return-void
.end method


# virtual methods
.method protected c(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 13
    const-string v0, "hms_bindfaildlg_title"

    invoke-static {v0}, Lcom/huawei/hms/c/h;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected d(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 17
    const/4 v0, 0x0

    return-object v0
.end method
