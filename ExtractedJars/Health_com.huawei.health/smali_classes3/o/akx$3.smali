.class Lo/akx$3;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/akx;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/akx;


# direct methods
.method constructor <init>(Lo/akx;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lo/akx$3;->b:Lo/akx;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 196
    iget-object v0, p0, Lo/akx$3;->b:Lo/akx;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/akx;->e(I)Z

    .line 197
    return-void
.end method
