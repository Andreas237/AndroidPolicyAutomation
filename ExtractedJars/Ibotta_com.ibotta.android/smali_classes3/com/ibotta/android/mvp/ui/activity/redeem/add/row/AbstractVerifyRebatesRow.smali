.class public abstract Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;
.super Ljava/lang/Object;
.source "AbstractVerifyRebatesRow.java"


# instance fields
.field private final verifyRebatesRowType:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRowType;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRowType;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;->verifyRebatesRowType:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRowType;

    return-void
.end method


# virtual methods
.method public getType()I
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;->verifyRebatesRowType:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRowType;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRowType;->ordinal()I

    move-result v0

    return v0
.end method
