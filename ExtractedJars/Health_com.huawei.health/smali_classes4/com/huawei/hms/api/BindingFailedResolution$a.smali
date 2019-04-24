.class Lcom/huawei/hms/api/BindingFailedResolution$a;
.super Lcom/huawei/hms/b/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/api/BindingFailedResolution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 178
    invoke-direct {p0}, Lcom/huawei/hms/b/f;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hms/api/a;)V
    .locals 0

    .line 178
    invoke-direct {p0}, Lcom/huawei/hms/api/BindingFailedResolution$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 182
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/huawei/hms/c/j;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 183
    const-string v0, "com.huawei.hwid"

    invoke-static {p1, v0}, Lcom/huawei/hms/c/j;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 184
    const-string v0, "hms_bindfaildlg_message"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/hms/c/h;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 189
    const-string v0, "hms_confirm"

    invoke-static {v0}, Lcom/huawei/hms/c/h;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
