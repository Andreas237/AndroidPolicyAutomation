.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;
.super Ljava/lang/Object;
.source "AbstractEarningsDetailRow.java"


# instance fields
.field private final earningsDetailRowType:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;->earningsDetailRowType:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    return-void
.end method


# virtual methods
.method public getType()I
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;->earningsDetailRowType:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->ordinal()I

    move-result v0

    return v0
.end method
