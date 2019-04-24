.class Lo/ezm$e;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ezm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 292
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 293
    return-void
.end method


# virtual methods
.method public c(Landroid/view/View;)V
    .locals 2

    .line 296
    invoke-virtual {p0}, Lo/ezm$e;->removeAllViews()V

    .line 297
    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, p1, v0, v1}, Lo/ezm$e;->addView(Landroid/view/View;II)V

    .line 300
    return-void
.end method
