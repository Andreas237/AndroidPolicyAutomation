.class Lo/cig$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cig;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cig;


# direct methods
.method constructor <init>(Lo/cig;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lo/cig$2;->c:Lo/cig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 113
    iget-object v0, p0, Lo/cig$2;->c:Lo/cig;

    invoke-static {v0}, Lo/cig;->c(Lo/cig;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 114
    iget-object v0, p0, Lo/cig$2;->c:Lo/cig;

    iget-object v1, p0, Lo/cig$2;->c:Lo/cig;

    invoke-static {v1}, Lo/cig;->d(Lo/cig;)I

    move-result v1

    invoke-static {v0, v1}, Lo/cig;->c(Lo/cig;I)V

    .line 115
    return-void
.end method
