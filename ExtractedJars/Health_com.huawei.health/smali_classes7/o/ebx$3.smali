.class Lo/ebx$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ebx;->c(Lo/dav;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic d:Lo/ebx;


# direct methods
.method constructor <init>(Lo/ebx;Ljava/util/ArrayList;)V
    .locals 0

    .line 265
    iput-object p1, p0, Lo/ebx$3;->d:Lo/ebx;

    iput-object p2, p0, Lo/ebx$3;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 268
    iget-object v0, p0, Lo/ebx$3;->d:Lo/ebx;

    iget-object v1, p0, Lo/ebx$3;->a:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lo/ebx;->c(Lo/ebx;Ljava/util/ArrayList;)V

    .line 269
    return-void
.end method
