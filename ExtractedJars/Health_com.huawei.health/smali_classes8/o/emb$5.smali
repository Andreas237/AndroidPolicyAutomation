.class Lo/emb$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/emb;->onTouchEvent(Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic d:Lo/emb;


# direct methods
.method constructor <init>(Lo/emb;I)V
    .locals 0

    .line 201
    iput-object p1, p0, Lo/emb$5;->d:Lo/emb;

    iput p2, p0, Lo/emb$5;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 204
    iget-object v0, p0, Lo/emb$5;->d:Lo/emb;

    iget v1, p0, Lo/emb$5;->b:I

    iget-object v2, p0, Lo/emb$5;->d:Lo/emb;

    invoke-static {v2}, Lo/emb;->d(Lo/emb;)I

    move-result v2

    iget-object v3, p0, Lo/emb$5;->d:Lo/emb;

    invoke-static {v3}, Lo/emb;->b(Lo/emb;)I

    move-result v3

    iget-object v4, p0, Lo/emb$5;->d:Lo/emb;

    invoke-static {v4}, Lo/emb;->a(Lo/emb;)I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/emb;->setPadding(IIII)V

    .line 205
    return-void
.end method
