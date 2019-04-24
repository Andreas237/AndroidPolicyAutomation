.class public abstract Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;
.super Ljava/lang/Object;
.source "AbstractPersonalStoreRow.java"


# instance fields
.field private final personalStoreRowType:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;->personalStoreRowType:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    return-void
.end method


# virtual methods
.method public getType()I
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;->personalStoreRowType:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->ordinal()I

    move-result v0

    return v0
.end method
