.class Lo/bgr$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bgr;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/bgr;


# direct methods
.method constructor <init>(Lo/bgr;)V
    .locals 0

    .line 276
    iput-object p1, p0, Lo/bgr$5;->d:Lo/bgr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    .line 281
    iget-object v0, p0, Lo/bgr$5;->d:Lo/bgr;

    invoke-static {v0}, Lo/bgr;->b(Lo/bgr;)V

    .line 282
    iget-object v0, p0, Lo/bgr$5;->d:Lo/bgr;

    invoke-static {v0}, Lo/bgr;->d(Lo/bgr;)V

    .line 283
    return-void
.end method

.method public d()V
    .locals 0

    .line 288
    return-void
.end method
