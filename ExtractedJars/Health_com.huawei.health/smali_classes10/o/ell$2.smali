.class Lo/ell$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ell;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ell;


# direct methods
.method constructor <init>(Lo/ell;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lo/ell$2;->b:Lo/ell;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 48
    iget-object v0, p0, Lo/ell$2;->b:Lo/ell;

    invoke-virtual {v0}, Lo/ell;->getFirstVisiblePosition()I

    move-result v0

    if-lez v0, :cond_0

    .line 49
    iget-object v0, p0, Lo/ell$2;->b:Lo/ell;

    invoke-virtual {v0}, Lo/ell;->setSelectionAfterHeaderView()V

    .line 51
    :cond_0
    return-void
.end method
