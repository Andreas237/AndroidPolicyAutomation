.class Lo/fik$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fik;->c(Lo/fik$a;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fik;


# direct methods
.method constructor <init>(Lo/fik;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lo/fik$4;->c:Lo/fik;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 136
    iget-object v0, p0, Lo/fik$4;->c:Lo/fik;

    invoke-static {v0}, Lo/fik;->d(Lo/fik;)Lo/fik$e;

    move-result-object v0

    invoke-interface {v0}, Lo/fik$e;->b()V

    .line 137
    return-void
.end method
