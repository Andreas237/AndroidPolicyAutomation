.class Lo/csk$2;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/csk;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/csk;


# direct methods
.method constructor <init>(Lo/csk;)V
    .locals 0

    .line 1037
    iput-object p1, p0, Lo/csk$2;->a:Lo/csk;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1040
    iget-object v0, p0, Lo/csk$2;->a:Lo/csk;

    invoke-static {}, Lo/csk;->u()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2714

    const/4 v3, 0x5

    invoke-virtual {v0, v1, v2, v3}, Lo/csk;->c(Ljava/lang/String;II)V

    .line 1042
    return-void
.end method
