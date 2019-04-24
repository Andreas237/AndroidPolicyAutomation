.class public Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;
.super Ljava/lang/Object;
.source "DividerItemDecoration.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DividerRule"
.end annotation


# instance fields
.field public hasTopSpacing:Z

.field public position:I

.field public spacing:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    iput p1, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;->position:I

    .line 96
    iput p2, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;->spacing:I

    const/4 p1, 0x0

    .line 97
    iput-boolean p1, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;->hasTopSpacing:Z

    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 0

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    iput p1, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;->position:I

    .line 110
    iput p2, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;->spacing:I

    .line 111
    iput-boolean p3, p0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;->hasTopSpacing:Z

    return-void
.end method
