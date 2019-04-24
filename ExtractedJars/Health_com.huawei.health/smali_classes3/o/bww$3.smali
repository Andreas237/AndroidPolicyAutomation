.class Lo/bww$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bww;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bww;


# direct methods
.method constructor <init>(Lo/bww;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lo/bww$3;->b:Lo/bww;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 133
    iget-object v0, p0, Lo/bww$3;->b:Lo/bww;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/bww;->e(Lo/bww;Z)Z

    .line 134
    const/4 v0, 0x0

    return v0
.end method
