.class public Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;
.super Ljava/lang/Object;
.source "SLOptionsDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/shoppinglists/SLOptionsDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RowData"
.end annotation


# instance fields
.field public resId:I

.field public rowStatus:Ljava/lang/Double;

.field public rowType:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;


# direct methods
.method public constructor <init>(ILcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput p1, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->resId:I

    .line 42
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowType:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    .line 43
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowStatus:Ljava/lang/Double;

    return-void
.end method

.method public constructor <init>(ILcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;Ljava/lang/Double;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput p1, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->resId:I

    .line 48
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowType:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    .line 49
    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowStatus:Ljava/lang/Double;

    return-void
.end method
