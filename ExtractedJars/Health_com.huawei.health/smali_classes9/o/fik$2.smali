.class Lo/fik$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fik;->e(Lo/fik$d;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic d:Lo/fik;


# direct methods
.method constructor <init>(Lo/fik;I)V
    .locals 0

    .line 313
    iput-object p1, p0, Lo/fik$2;->d:Lo/fik;

    iput p2, p0, Lo/fik$2;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 316
    iget-object v0, p0, Lo/fik$2;->d:Lo/fik;

    invoke-static {v0}, Lo/fik;->d(Lo/fik;)Lo/fik$e;

    move-result-object v0

    iget v1, p0, Lo/fik$2;->b:I

    invoke-interface {v0, v1}, Lo/fik$e;->c(I)V

    .line 317
    return-void
.end method
