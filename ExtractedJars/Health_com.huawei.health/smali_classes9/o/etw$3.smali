.class Lo/etw$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/etw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/etw;


# direct methods
.method constructor <init>(Lo/etw;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lo/etw$3;->b:Lo/etw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 117
    iget-object v0, p0, Lo/etw$3;->b:Lo/etw;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/etw;->c(Lo/etw;Z)Z

    .line 118
    const-string v0, "FAQ"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushMessageToDevice weakHandler.postDelayed mPushFaqMessageState = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    return-void
.end method
