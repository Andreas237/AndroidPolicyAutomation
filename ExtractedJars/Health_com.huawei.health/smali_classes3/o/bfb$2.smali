.class Lo/bfb$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bfb;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bfb;


# direct methods
.method constructor <init>(Lo/bfb;)V
    .locals 0

    .line 726
    iput-object p1, p0, Lo/bfb$2;->b:Lo/bfb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 730
    iget-object v0, p0, Lo/bfb$2;->b:Lo/bfb;

    invoke-static {v0}, Lo/bfb;->e(Lo/bfb;)V

    .line 731
    return-void
.end method
