.class Lo/esv$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/esv;->b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/esv;


# direct methods
.method constructor <init>(Lo/esv;)V
    .locals 0

    .line 474
    iput-object p1, p0, Lo/esv$3;->d:Lo/esv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 477
    iget-object v0, p0, Lo/esv$3;->d:Lo/esv;

    invoke-virtual {v0}, Lo/esv;->h()V

    .line 478
    iget-object v0, p0, Lo/esv$3;->d:Lo/esv;

    invoke-virtual {v0}, Lo/esv;->g()V

    .line 479
    return-void
.end method
