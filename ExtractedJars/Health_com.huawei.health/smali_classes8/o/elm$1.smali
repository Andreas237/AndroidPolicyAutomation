.class Lo/elm$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/elm;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/elm;


# direct methods
.method constructor <init>(Lo/elm;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lo/elm$1;->b:Lo/elm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 50
    iget-object v0, p0, Lo/elm$1;->b:Lo/elm;

    invoke-virtual {v0}, Lo/elm;->getFirstVisiblePosition()I

    move-result v0

    if-lez v0, :cond_0

    .line 51
    iget-object v0, p0, Lo/elm$1;->b:Lo/elm;

    invoke-virtual {v0}, Lo/elm;->setSelectionAfterHeaderView()V

    .line 53
    :cond_0
    return-void
.end method
