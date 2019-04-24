.class Lo/epi$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/epi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic b:Lo/epi;


# direct methods
.method private constructor <init>(Lo/epi;)V
    .locals 0

    .line 272
    iput-object p1, p0, Lo/epi$d;->b:Lo/epi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/epi;Lo/epi$3;)V
    .locals 0

    .line 272
    invoke-direct {p0, p1}, Lo/epi$d;-><init>(Lo/epi;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 275
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check notification is enable "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    iget-object v0, p0, Lo/epi$d;->b:Lo/epi;

    invoke-static {v0}, Lo/epi;->c(Lo/epi;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->D(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    return-void

    .line 279
    :cond_0
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check notification is disabled "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    iget-object v0, p0, Lo/epi$d;->b:Lo/epi;

    invoke-static {v0}, Lo/epi;->a(Lo/epi;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-static {v0, v1}, Lo/dbf;->e(Landroid/content/Context;Ljava/lang/Class;)V

    .line 281
    iget-object v0, p0, Lo/epi$d;->b:Lo/epi;

    invoke-static {v0}, Lo/epi;->e(Lo/epi;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 282
    iget-object v0, p0, Lo/epi$d;->b:Lo/epi;

    invoke-static {v0}, Lo/epi;->e(Lo/epi;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x7

    const-wide/16 v2, 0x4e20

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 284
    return-void
.end method
