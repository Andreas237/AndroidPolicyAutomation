.class Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl$AppSortDataComparator;
.super Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$SortDataComparator;
.source "PersonalAppFinderImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AppSortDataComparator"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl$AppSortDataComparator;->this$0:Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;

    invoke-direct {p0}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$SortDataComparator;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl$1;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl$AppSortDataComparator;-><init>(Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;)V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/RetailerModel;)I
    .locals 4

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl$AppSortDataComparator;->this$0:Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;

    invoke-static {v0}, Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;->access$100(Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;)Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    .line 50
    iget-object v1, p0, Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl$AppSortDataComparator;->this$0:Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;

    invoke-static {v1}, Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;->access$100(Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;)Ljava/util/LinkedHashSet;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/util/LinkedHashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    .line 52
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Boolean;)I

    move-result v2

    mul-int/lit8 v2, v2, -0x1

    if-eqz v0, :cond_0

    if-nez v1, :cond_1

    :cond_0
    if-nez v2, :cond_1

    .line 55
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$SortDataComparator;->compare(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/RetailerModel;)I

    move-result v2

    :cond_1
    return v2
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 46
    check-cast p1, Lcom/ibotta/api/model/RetailerModel;

    check-cast p2, Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl$AppSortDataComparator;->compare(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/RetailerModel;)I

    move-result p1

    return p1
.end method
