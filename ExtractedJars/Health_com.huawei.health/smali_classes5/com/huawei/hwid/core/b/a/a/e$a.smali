.class public Lcom/huawei/hwid/core/b/a/a/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/b/a/a/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field private c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 302
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 294
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e$a;->a:Ljava/lang/String;

    .line 298
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e$a;->b:Ljava/lang/String;

    .line 300
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/e$a;->c:Z

    .line 303
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 304
    return-void

    .line 307
    :cond_0
    const-string v0, "&resultDigest="

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 308
    const/4 v0, -0x1

    if-eq v1, v0, :cond_1

    .line 309
    const/4 v0, 0x0

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e$a;->a:Ljava/lang/String;

    .line 310
    const-string v0, "&resultDigest="

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e$a;->b:Ljava/lang/String;

    .line 311
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/e$a;->c:Z

    .line 313
    :cond_1
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 319
    iget-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/e$a;->c:Z

    return v0
.end method
