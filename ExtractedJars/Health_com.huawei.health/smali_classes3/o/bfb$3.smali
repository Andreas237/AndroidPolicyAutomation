.class Lo/bfb$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bfb;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/bfb;


# direct methods
.method constructor <init>(Lo/bfb;)V
    .locals 0

    .line 677
    iput-object p1, p0, Lo/bfb$3;->e:Lo/bfb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 681
    iget-object v0, p0, Lo/bfb$3;->e:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->e()V

    .line 682
    return-void
.end method
