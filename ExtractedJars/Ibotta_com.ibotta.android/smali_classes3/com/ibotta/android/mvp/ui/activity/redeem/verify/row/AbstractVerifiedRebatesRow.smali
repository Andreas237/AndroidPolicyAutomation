.class public abstract Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;
.super Ljava/lang/Object;
.source "AbstractVerifiedRebatesRow.java"


# instance fields
.field private final verifiedRebatesRowType:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;->verifiedRebatesRowType:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    return-void
.end method


# virtual methods
.method public getType()I
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;->verifiedRebatesRowType:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;->ordinal()I

    move-result v0

    return v0
.end method
