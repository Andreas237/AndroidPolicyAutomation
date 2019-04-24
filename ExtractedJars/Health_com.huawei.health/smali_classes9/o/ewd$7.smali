.class Lo/ewd$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ewd;->d(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:I

.field final synthetic e:Lo/ewd;


# direct methods
.method constructor <init>(Lo/ewd;I)V
    .locals 0

    .line 482
    iput-object p1, p0, Lo/ewd$7;->e:Lo/ewd;

    iput p2, p0, Lo/ewd$7;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 485
    iget-object v0, p0, Lo/ewd$7;->e:Lo/ewd;

    iget v1, p0, Lo/ewd$7;->d:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ewd;->c(IZ)Z

    .line 486
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ThreadPoolUtils startParser!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 487
    return-void
.end method
