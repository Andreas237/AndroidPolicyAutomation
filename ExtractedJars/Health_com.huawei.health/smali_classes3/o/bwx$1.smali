.class Lo/bwx$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwx;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bwx;


# direct methods
.method constructor <init>(Lo/bwx;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lo/bwx$1;->a:Lo/bwx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 232
    iget-object v0, p0, Lo/bwx$1;->a:Lo/bwx;

    invoke-static {v0}, Lo/bwx;->e(Lo/bwx;)V

    .line 233
    return-void
.end method
