.class Lo/cgj$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgj;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cgj;


# direct methods
.method constructor <init>(Lo/cgj;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lo/cgj$5;->d:Lo/cgj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 251
    iget-object v0, p0, Lo/cgj$5;->d:Lo/cgj;

    invoke-static {v0}, Lo/cgj;->a(Lo/cgj;)V

    .line 252
    return-void
.end method
