.class Lo/fgm$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fgm;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/fgm;


# direct methods
.method constructor <init>(Lo/fgm;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lo/fgm$5;->d:Lo/fgm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 69
    :try_start_0
    iget-object v0, p0, Lo/fgm$5;->d:Lo/fgm;

    invoke-static {v0}, Lo/fgm;->e(Lo/fgm;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "userInfoAgreement"

    invoke-virtual {v0, v1}, Lo/cze;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 70
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 71
    new-instance v5, Ljava/net/URI;

    invoke-direct {v5, v4}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 72
    iget-object v0, p0, Lo/fgm$5;->d:Lo/fgm;

    invoke-static {v0, v5}, Lo/fgm;->d(Lo/fgm;Ljava/net/URI;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    :cond_0
    goto :goto_0

    .line 75
    :catch_0
    move-exception v4

    .line 77
    const-string v0, "GetAggreement"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doRequest"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    :goto_0
    return-void
.end method
