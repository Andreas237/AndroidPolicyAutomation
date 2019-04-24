.class Lo/euq$1;
.super Landroid/support/v7/widget/GridLayoutManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/euq;->e(Lo/euo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/euq;


# direct methods
.method constructor <init>(Lo/euq;Landroid/content/Context;I)V
    .locals 0

    .line 208
    iput-object p1, p0, Lo/euq$1;->b:Lo/euq;

    invoke-direct {p0, p2, p3}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public canScrollHorizontally()Z
    .locals 1

    .line 216
    const/4 v0, 0x0

    return v0
.end method

.method public canScrollVertically()Z
    .locals 1

    .line 211
    const/4 v0, 0x0

    return v0
.end method
