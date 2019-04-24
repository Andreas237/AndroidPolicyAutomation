.class public Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;
.super Ljava/lang/Object;
.source "ShoppingListDataSource.java"

# interfaces
.implements Lcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;
.implements Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;
    }
.end annotation


# static fields
.field public static ENTRY_ID_PREFIX:Ljava/lang/String; = "TEMP"

.field public static final EVENT_RECEIVE_SUGGESTION:Ljava/lang/String; = "eventReceiveSuggestion"

.field public static final EVENT_SHOPPINGLIST_CHANGED:Ljava/lang/String; = "eventShoppingListChanged"

.field public static final EVENT_SHOPPINGLIST_CLEARED:Ljava/lang/String; = "eventShoppingListCleared"

.field public static final EVENT_SHOPPINGLIST_CREATED:Ljava/lang/String; = "eventShoppingListCreated"

.field public static final EVENT_SHOPPINGLIST_CREATED_FINISHED:Ljava/lang/String; = "eventShoppingListCreatedFinished"

.field public static final EVENT_SHOPPINGLIST_DELETED:Ljava/lang/String; = "eventShoppingListDeleted"

.field public static final EVENT_SHOPPINGLIST_ENTRY_ADDED:Ljava/lang/String; = "eventShoppingListEntryAdded"

.field public static final EVENT_SHOPPINGLIST_ENTRY_ADDED_FINISHED:Ljava/lang/String; = "eventShoppingListEntryAddedFinished"

.field public static final EVENT_SHOPPINGLIST_ENTRY_COMPLETION_TOGGLED:Ljava/lang/String; = "eventShoppingListEntryCompletionToggled"

.field public static final EVENT_SHOPPINGLIST_ENTRY_DELETED:Ljava/lang/String; = "eventShoppingListEntryDeleted"

.field public static final EVENT_SHOPPINGLIST_ENTRY_UPDATED:Ljava/lang/String; = "eventShoppingListInvalidated"

.field public static final EVENT_SHOPPINGLIST_READY:Ljava/lang/String; = "eventShoppingListReady"

.field public static final EVENT_SHOPPINGLIST_RENAMED:Ljava/lang/String; = "eventShoppingListRenamed"

.field public static final EVENT_SHOPPINGLIST_START_SYNC:Ljava/lang/String; = "eventShoppingListStartSync"

.field public static MAX_PENDING_MODIFICATION_COUNT:I = 0x1388

.field public static final PARAM_PREVIOUS_SHOPPINGLIST_ENTRY_ID:Ljava/lang/String; = "paramPreviousShoppingListEntryId"

.field public static final PARAM_PREVIOUS_SHOPPINGLIST_ID:Ljava/lang/String; = "paramPreviousShoppingListId"

.field public static final PARAM_SHOPPINGLIST_ENTRY_ID:Ljava/lang/String; = "paramShoppingListEntryId"

.field public static final PARAM_SHOPPINGLIST_ID:Ljava/lang/String; = "paramShoppingListId"

.field public static final PARAM_SUGGESTION_KEYWORD:Ljava/lang/String; = "paramSuggestionKeyword"

.field public static final PARAM_SUGGESTION_LIST:Ljava/lang/String; = "paramSuggestionList"

.field public static final PREFIX_OFFLINE_DATA_STORE:Ljava/lang/String; = "SHOPPING_LIST_INFO"

.field public static SHOPPING_LIST_ID_PREFIX:Ljava/lang/String; = "TempListId"


# instance fields
.field private final LOG_TAG:Ljava/lang/String;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appPref:Lcom/shopkick/app/application/AppPreferences;

.field private context:Landroid/content/Context;

.field private entityList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;",
            ">;"
        }
    .end annotation
.end field

.field private hasSyncSucceeded:Z

.field private idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

.field private isSessionStarted:Z

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

.field private popularItemList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;",
            ">;"
        }
    .end annotation
.end field

.field private popularItemRequest:Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListRequest;

.field private quantityUnits:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

.field private scheduledSyncTrigger:Ljava/lang/Integer;

.field private shoppingListInfoMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;",
            ">;"
        }
    .end annotation
.end field

.field private suggestionsRequest:Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;

.field private taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

.field private tempIdToCanonicalIdMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;Lcom/shopkick/app/account/UserAccount;)V
    .locals 1

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p6, "ShoppingListDataSource"

    .line 50
    iput-object p6, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->LOG_TAG:Ljava/lang/String;

    .line 100
    new-instance p6, Ljava/util/ArrayList;

    invoke-direct {p6}, Ljava/util/ArrayList;-><init>()V

    iput-object p6, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    .line 101
    new-instance p6, Ljava/util/HashMap;

    invoke-direct {p6}, Ljava/util/HashMap;-><init>()V

    iput-object p6, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->shoppingListInfoMap:Ljava/util/HashMap;

    .line 102
    new-instance p6, Ljava/util/HashMap;

    invoke-direct {p6}, Ljava/util/HashMap;-><init>()V

    iput-object p6, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->tempIdToCanonicalIdMap:Ljava/util/HashMap;

    .line 104
    new-instance p6, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p6, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p6, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p6, 0x0

    .line 105
    iput-object p6, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->scheduledSyncTrigger:Ljava/lang/Integer;

    .line 106
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->isSessionStarted:Z

    .line 108
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->hasSyncSucceeded:Z

    .line 113
    new-instance p6, Ljava/util/ArrayList;

    invoke-direct {p6}, Ljava/util/ArrayList;-><init>()V

    iput-object p6, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->popularItemList:Ljava/util/ArrayList;

    .line 130
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->context:Landroid/content/Context;

    .line 131
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->appPref:Lcom/shopkick/app/application/AppPreferences;

    .line 132
    iput-object p4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 133
    iput-object p5, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    .line 134
    iput-object p7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    .line 135
    iput-object p8, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 137
    new-instance p2, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-direct {p2, p1, p0, p8}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;-><init>(Landroid/content/Context;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/account/UserAccount;)V

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    const-string p1, "AppActivityManagerAppForegroundedEvent"

    .line 140
    invoke-virtual {p4, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "AppActivityManagerAppBackgroundedEvent"

    .line 141
    invoke-virtual {p4, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "UserAccountIdChangedEvent"

    .line 142
    invoke-virtual {p4, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "LogoutRequestSuccess"

    .line 143
    invoke-virtual {p4, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "LogoutRequestFailure"

    .line 144
    invoke-virtual {p4, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 147
    iget-object p1, p3, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-eqz p1, :cond_0

    iget-object p1, p3, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shoppingListsTempIdPrefix:Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object p1, p3, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shoppingListsTempIdPrefix:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->ENTRY_ID_PREFIX:Ljava/lang/String;

    :goto_0
    sput-object p1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->ENTRY_ID_PREFIX:Ljava/lang/String;

    .line 152
    iget-object p1, p3, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-eqz p1, :cond_1

    iget-object p1, p3, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxPendingShoppingListCreationAndModifications:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    iget-object p1, p3, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxPendingShoppingListCreationAndModifications:Ljava/lang/Integer;

    .line 154
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_1
    sget p1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->MAX_PENDING_MODIFICATION_COUNT:I

    :goto_1
    sput p1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->MAX_PENDING_MODIFICATION_COUNT:I

    .line 158
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->quantityUnits:Ljava/util/HashSet;

    .line 159
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->quantityUnits:Ljava/util/HashSet;

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 160
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->quantityUnits:Ljava/util/HashSet;

    const/4 p2, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private cloneEntryToMove(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
    .locals 2

    const/4 v0, 0x0

    .line 1126
    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object p1

    .line 1127
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->ENTRY_ID_PREFIX:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getUniqueNumericString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    const/4 v0, 0x0

    .line 1128
    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    return-object p1
.end method

.method private convertSuggestionToEntry(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
    .locals 5

    .line 1248
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;-><init>()V

    .line 1249
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->ENTRY_ID_PREFIX:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getUniqueNumericString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    const/4 v1, 0x1

    .line 1250
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    .line 1251
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->title:Ljava/lang/String;

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->title:Ljava/lang/String;

    .line 1252
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/Quantity;-><init>()V

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    .line 1253
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    .line 1254
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->unit:Ljava/lang/Integer;

    .line 1255
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    .line 1256
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->keywordId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->keywordId:Ljava/lang/String;

    .line 1257
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->taxonomyNodeId:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    return-object v0
.end method

.method private fillShoppingListEntryFields(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
    .locals 4

    .line 1264
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1265
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->ENTRY_ID_PREFIX:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getUniqueNumericString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    .line 1268
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    if-nez v0, :cond_1

    .line 1269
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/Quantity;-><init>()V

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    .line 1272
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    if-nez v0, :cond_2

    .line 1273
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    .line 1276
    :cond_2
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->unit:Ljava/lang/Integer;

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->quantityUnits:Ljava/util/HashSet;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->unit:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1277
    :cond_3
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->unit:Ljava/lang/Integer;

    .line 1280
    :cond_4
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    if-nez v0, :cond_5

    .line 1281
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    .line 1284
    :cond_5
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    if-nez v0, :cond_6

    .line 1285
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    :cond_6
    return-object p1
.end method

.method private getChildShoppingListEntries(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;Ljava/lang/String;)Ljava/util/HashSet;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashSet<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;",
            ">;"
        }
    .end annotation

    .line 1114
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 1116
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 1117
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1118
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private getExistingEntryWidthKeywordId(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
    .locals 3

    .line 1160
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 1161
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    if-eqz v1, :cond_1

    goto :goto_0

    .line 1164
    :cond_1
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->title:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->title:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    :cond_2
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->keywordId:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->keywordId:Ljava/lang/String;

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->keywordId:Ljava/lang/String;

    .line 1165
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :cond_4
    :goto_1
    return-object v0
.end method

.method private getExistingEntryWithId(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
    .locals 4

    .line 1177
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1181
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    .line 1182
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    .line 1183
    invoke-virtual {p0, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    .line 1184
    invoke-virtual {p0, v3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1183
    invoke-virtual {p0, v2, v3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 1185
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    .line 1186
    invoke-virtual {p0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1185
    invoke-direct {p0, p1, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getChildShoppingListEntries(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;Ljava/lang/String;)Ljava/util/HashSet;

    move-result-object p1

    .line 1187
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1190
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 1191
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    .line 1192
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1193
    :cond_3
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1198
    :cond_4
    new-instance p1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$2;

    invoke-direct {p1, p0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$2;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)V

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1213
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    :goto_1
    const-string v0, "ShoppingListDataSource"

    .line 1215
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "addShoppingListEntryWithId: newEntry: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "ShoppingListDataSource"

    .line 1216
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "addShoppingListEntryWithId: pickedEntry: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method private getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;
    .locals 3

    .line 1133
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    const-string v1, "SHOPPING_LIST_INFO"

    const/4 v2, 0x6

    invoke-virtual {v0, p1, v2, v1}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntityKeyForId(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1137
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    .line 1138
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityKey:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private handlePopularItemsResponse(Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 1071
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;->popularItems:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;->popularItems:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1072
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->popularItemList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1073
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->popularItemList:Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;->popularItems:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1075
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;->taxonomyNodes:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;->taxonomyNodes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 1076
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;->taxonomyNodes:Ljava/util/List;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->addTaxonomyNodes(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public static isCanonicalEntryId(Ljava/lang/String;)Z
    .locals 1

    if-eqz p0, :cond_0

    .line 218
    sget-object v0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->ENTRY_ID_PREFIX:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isCanonicalShoppingListId(Ljava/lang/String;)Z
    .locals 1

    if-eqz p0, :cond_0

    .line 214
    sget-object v0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->SHOPPING_LIST_ID_PREFIX:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private log(ILjava/lang/String;)V
    .locals 4

    .line 1300
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    .line 1301
    array-length v1, v0

    const/4 v2, 0x3

    if-le v1, v2, :cond_0

    .line 1302
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "method:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/errorCode:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "/id:"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1303
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object p2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private maybeDeduplicateShoppingListEntry(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
    .locals 8

    .line 552
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getExistingEntry(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v0

    .line 555
    invoke-direct {p0, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->fillShoppingListEntryFields(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object p2

    .line 556
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_3

    .line 561
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 564
    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->keywordId:Ljava/lang/String;

    if-nez v3, :cond_1

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->keywordId:Ljava/lang/String;

    if-eqz v3, :cond_1

    .line 568
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 571
    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    .line 572
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    add-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, v3, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    .line 575
    :cond_0
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 578
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {p1, v1, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestDeleteShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)V

    .line 579
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {p1, v1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestAddShoppingListEntry(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)V

    goto :goto_1

    .line 588
    :cond_1
    iget-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v3, 0x2

    if-ne p1, v3, :cond_2

    .line 589
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    const/4 v3, 0x0

    .line 592
    invoke-virtual {p0, v1, v2, v3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->toggleShoppingListEntryCompletion(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 596
    :cond_2
    iget-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    add-double/2addr p1, v3

    .line 600
    :goto_0
    invoke-virtual {p0, v1, v2, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->updateShoppingListEntryQuantity(Ljava/lang/String;Ljava/lang/String;D)V

    move-object p2, v0

    goto :goto_1

    .line 606
    :cond_3
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 609
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {p1, v1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestAddShoppingListEntry(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)V

    :goto_1
    return-object p2
.end method

.method private notifyEntryEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1320
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEntryEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private notifyEntryEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1324
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "paramShoppingListId"

    .line 1325
    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "paramShoppingListEntryId"

    .line 1326
    invoke-virtual {v0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "paramPreviousShoppingListEntryId"

    .line 1327
    invoke-virtual {v0, p2, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1328
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {p2, p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void
.end method

.method private notifyEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1308
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1313
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "paramShoppingListId"

    .line 1314
    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "paramPreviousShoppingListId"

    .line 1315
    invoke-virtual {v0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1316
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {p2, p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void
.end method

.method private startShoppingList()V
    .locals 2

    .line 1372
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->scheduledSyncTrigger:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    return-void

    .line 1374
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntityKeysForDataCategory(I)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "eventShoppingListReady"

    const/4 v1, 0x0

    .line 1375
    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEvent(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1379
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntitiesForOfflineDataCategory(ILcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;)V

    :goto_0
    return-void
.end method

.method private stopApiRequests()V
    .locals 2

    .line 1293
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->suggestionsRequest:Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;

    if-eqz v0, :cond_0

    .line 1294
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    const/4 v0, 0x0

    .line 1295
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->suggestionsRequest:Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;

    :cond_0
    return-void
.end method

.method private syncList(Ljava/lang/Integer;)V
    .locals 3

    const-string v0, "ShoppingListDataSource"

    .line 1336
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "syncList "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1338
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->scheduledSyncTrigger:Ljava/lang/Integer;

    const-string v1, "eventShoppingListStartSync"

    .line 1339
    invoke-direct {p0, v1, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEvent(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1341
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->hasSyncSucceeded:Z

    .line 1343
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x6

    .line 1344
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1345
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-virtual {v1, v0, p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->syncOfflineDataCategories(Ljava/util/List;Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;Ljava/lang/Integer;)V

    return-void
.end method

.method private writeEntityByCopy(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V
    .locals 3

    .line 1225
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    if-eqz v0, :cond_0

    .line 1226
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;-><init>()V

    .line 1227
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    .line 1228
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->name:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->name:Ljava/lang/String;

    .line 1229
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->deleted:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->deleted:Ljava/lang/Boolean;

    .line 1230
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->createdTimeMs:Ljava/lang/Long;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->createdTimeMs:Ljava/lang/Long;

    .line 1231
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->modifiedTimeMs:Ljava/lang/Long;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->modifiedTimeMs:Ljava/lang/Long;

    .line 1234
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    if-eqz v1, :cond_1

    .line 1235
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1239
    :cond_1
    :goto_0
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;-><init>()V

    .line 1240
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityKey:Ljava/lang/String;

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityKey:Ljava/lang/String;

    .line 1241
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityVersion:Ljava/lang/String;

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityVersion:Ljava/lang/String;

    .line 1242
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->dataCategory:Ljava/lang/Integer;

    iput-object p1, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->dataCategory:Ljava/lang/Integer;

    .line 1243
    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    .line 1244
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/offline/OfflineDataStore;->setEntity(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    return-void
.end method


# virtual methods
.method public addShoppingListEntry(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
    .locals 5

    .line 616
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    .line 620
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 p2, 0x1

    .line 624
    invoke-direct {p0, p2, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->log(ILjava/lang/String;)V

    return-object v0

    .line 629
    :cond_1
    invoke-direct {p0, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->fillShoppingListEntryFields(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object p2

    .line 632
    invoke-direct {p0, v1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->maybeDeduplicateShoppingListEntry(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v0

    .line 633
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    const-string v2, "ShoppingListDataSource"

    .line 635
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "addShoppingListEntry: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->title:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 638
    invoke-direct {p0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->writeEntityByCopy(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    .line 641
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "eventShoppingListEntryAdded"

    .line 642
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-direct {p0, p2, p1, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEntryEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-object v0

    :cond_3
    :goto_0
    return-object v0
.end method

.method public addShoppingListSuggestions(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;",
            ">;)V"
        }
    .end annotation

    .line 523
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    .line 525
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 527
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 p2, 0x1

    .line 531
    invoke-direct {p0, p2, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->log(ILjava/lang/String;)V

    return-void

    :cond_1
    const-string v1, "ShoppingListDataSource"

    .line 535
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addShoppingListSuggestions: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 536
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    .line 538
    invoke-direct {p0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->convertSuggestionToEntry(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v1

    .line 539
    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->maybeDeduplicateShoppingListEntry(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    goto :goto_0

    .line 543
    :cond_2
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->writeEntityByCopy(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    const-string p2, "eventShoppingListChanged"

    .line 546
    invoke-direct {p0, p2, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEvent(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method public clear()V
    .locals 2

    .line 184
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->clear()V

    .line 187
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->stopApiRequests()V

    .line 190
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 191
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->shoppingListInfoMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->tempIdToCanonicalIdMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 195
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/shopkick/app/offline/OfflineDataStore;->clearCategory(I)V

    const/4 v0, 0x0

    .line 198
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->scheduledSyncTrigger:Ljava/lang/Integer;

    return-void
.end method

.method public clearCompletedShoppingList(Ljava/lang/String;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 421
    :cond_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 422
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 426
    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->log(ILjava/lang/String;)V

    return-void

    :cond_1
    const-string v1, "ShoppingListDataSource"

    .line 430
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "clearCompletedShoppingListEntries: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getCompletedShoppingListEntries(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    if-nez v1, :cond_2

    return-void

    .line 435
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 436
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 437
    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 438
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v3, p1, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestDeleteShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 440
    :cond_3
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->writeEntityByCopy(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    :cond_4
    const-string v0, "eventShoppingListCleared"

    const/4 v1, 0x0

    .line 444
    invoke-direct {p0, v0, p1, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 3

    .line 1514
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->suggestionsRequest:Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->popularItemRequest:Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListRequest;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p2, "ShoppingListDataSource"

    .line 1515
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "invalid request: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 1519
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->suggestionsRequest:Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 1521
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsResponse;

    .line 1522
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->suggestionsRequest:Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;->searchString:Ljava/lang/String;

    .line 1524
    iput-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->suggestionsRequest:Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;

    if-eqz p1, :cond_1

    .line 1525
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsResponse;->taxonomyNodes:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 1526
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsResponse;->taxonomyNodes:Ljava/util/List;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->addTaxonomyNodes(Ljava/util/List;)V

    .line 1529
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v2, "paramSuggestionList"

    if-eqz p1, :cond_2

    .line 1530
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsResponse;->suggestions:Ljava/util/List;

    :cond_2
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "paramSuggestionKeyword"

    .line 1531
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1532
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "eventReceiveSuggestion"

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    goto :goto_0

    .line 1534
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->popularItemRequest:Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListRequest;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_4

    .line 1535
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;

    .line 1536
    iput-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->popularItemRequest:Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListRequest;

    .line 1537
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->handlePopularItemsResponse(Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListResponse;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public createShoppingList(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;
    .locals 6

    const-string v0, "ShoppingListDataSource"

    .line 310
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "createShoppingList: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;-><init>()V

    .line 312
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->SHOPPING_LIST_ID_PREFIX:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getUniqueNumericString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    .line 313
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->name:Ljava/lang/String;

    .line 314
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    const/4 p1, 0x0

    .line 315
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->deleted:Ljava/lang/Boolean;

    .line 316
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->createdTimeMs:Ljava/lang/Long;

    .line 317
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->modifiedTimeMs:Ljava/lang/Long;

    .line 318
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->shoppingListInfoMap:Ljava/util/HashMap;

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;-><init>()V

    .line 322
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    const-string v4, "SHOPPING_LIST_INFO"

    const/4 v5, 0x6

    invoke-virtual {v2, v3, v5, v4}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntityKeyForId(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityKey:Ljava/lang/String;

    const-string v2, "OFFLINE_DATA_TEMP_ENTITY_VERSION"

    .line 325
    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityVersion:Ljava/lang/String;

    .line 326
    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    .line 327
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->dataCategory:Ljava/lang/Integer;

    .line 328
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    invoke-virtual {v2, p1, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 330
    invoke-direct {p0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->writeEntityByCopy(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    .line 333
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestCreateShoppingList(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;)V

    const-string p1, "eventShoppingListCreated"

    .line 336
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    invoke-direct {p0, p1, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEvent(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public deleteShoppingList(Ljava/lang/String;)V
    .locals 4

    .line 342
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "ShoppingListDataSource"

    .line 344
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteShoppingList: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->shoppingListInfoMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    .line 349
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->shoppingListInfoMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object v0

    if-nez v0, :cond_1

    .line 354
    invoke-direct {p0, v1, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->log(ILjava/lang/String;)V

    const/4 v0, 0x3

    .line 355
    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->log(ILjava/lang/String;)V

    return-void

    .line 360
    :cond_1
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {v2, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestDeleteShoppingList(Ljava/lang/String;)V

    .line 363
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    const/4 v3, 0x0

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    .line 364
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->deleted:Ljava/lang/Boolean;

    .line 365
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->writeEntityByCopy(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    .line 366
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const-string v0, "eventShoppingListDeleted"

    .line 369
    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEvent(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public deleteShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 875
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 876
    invoke-virtual {p0, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p1, :cond_6

    if-nez p2, :cond_0

    goto/16 :goto_2

    .line 880
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object v0

    .line 881
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 885
    invoke-direct {p0, v2, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->log(ILjava/lang/String;)V

    return-void

    :cond_1
    if-nez v1, :cond_2

    const/4 p1, 0x2

    .line 891
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->log(ILjava/lang/String;)V

    return-void

    :cond_2
    const-string v3, "ShoppingListDataSource"

    .line 895
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "deleteShoppingListEntry: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v3, p2}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 898
    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 899
    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p0, v3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 900
    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 903
    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    if-nez v3, :cond_4

    .line 904
    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    .line 905
    invoke-virtual {p0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 904
    invoke-direct {p0, v3, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getChildShoppingListEntries(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;Ljava/lang/String;)Ljava/util/HashSet;

    move-result-object v1

    .line 906
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 907
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p0, v4}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 908
    iget-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 911
    :cond_3
    invoke-virtual {p2}, Ljava/util/HashSet;->size()I

    move-result v1

    if-le v1, v2, :cond_4

    const-string v1, "ShoppingListDataSource"

    .line 912
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteShoppingListEntry: delete "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 916
    :cond_4
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->writeEntityByCopy(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    .line 918
    invoke-virtual {p2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 920
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {v1, p1, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestDeleteShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "eventShoppingListEntryDeleted"

    .line 923
    invoke-direct {p0, v1, p1, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEntryEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    return-void

    :cond_6
    :goto_2
    return-void
.end method

.method public destroy()V
    .locals 1

    .line 178
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->stopApiRequests()V

    .line 179
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->stopApiRequests()V

    .line 180
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method public fetchPopularItems()V
    .locals 10

    .line 1050
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->popularItemList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 1051
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->popularItemRequest:Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListRequest;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 1052
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 1053
    iput-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->popularItemRequest:Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListRequest;

    .line 1056
    :cond_1
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->popularItemRequest:Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListRequest;

    .line 1057
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->popularItemRequest:Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListRequest;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListRequest;->shoppingListId:Ljava/lang/String;

    .line 1059
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v3, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->popularItemRequest:Lcom/shopkick/app/fetchers/api/skapi/GetPopularItemsListRequest;

    const/4 v6, 0x1

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    move-object v5, p0

    invoke-virtual/range {v2 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method public getCompletedShoppingListEntries(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;",
            ">;"
        }
    .end annotation

    .line 396
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 397
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 401
    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->log(ILjava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v1, "ShoppingListDataSource"

    .line 405
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCompletedShoppingListEntries: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 408
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 409
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    if-eqz v2, :cond_1

    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 410
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method public getExistingEntry(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1152
    :cond_0
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    if-nez v0, :cond_2

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 1153
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getExistingEntryWidthKeywordId(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object p1

    goto :goto_1

    .line 1152
    :cond_2
    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getExistingEntryWithId(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public getExistingEntry(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
    .locals 0

    .line 1147
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getExistingEntry(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object p1

    return-object p1
.end method

.method public getPopularItemList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;",
            ">;"
        }
    .end annotation

    .line 1046
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->popularItemList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getSecuredId(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_0

    .line 1087
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->tempIdToCanonicalIdMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->tempIdToCanonicalIdMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    return-object p1
.end method

.method public getSelectedShoppingList()Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;
    .locals 5

    .line 257
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getSelectedShoppingListId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 260
    invoke-virtual {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingList(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 285
    :cond_0
    invoke-virtual {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingList(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v0

    return-object v0

    .line 263
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListCount()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_2

    .line 265
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    goto :goto_2

    .line 269
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isNewUser()Z

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->hasSyncSucceeded:Z

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    .line 270
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->context:Landroid/content/Context;

    const v2, 0x7f110695

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 271
    invoke-virtual {v4}, Lcom/shopkick/app/account/UserAccount;->getDisplayName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    .line 270
    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->createShoppingList(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v0

    :goto_2
    if-eqz v0, :cond_5

    .line 279
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->setSelectedShoppingListId(Ljava/lang/String;)V

    :cond_5
    return-object v0
.end method

.method public getShoppingList(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;
    .locals 2

    .line 297
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->shoppingListInfoMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    if-nez v0, :cond_1

    const/4 v1, 0x1

    .line 303
    invoke-direct {p0, v1, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->log(ILjava/lang/String;)V

    :cond_1
    return-object v0
.end method

.method public getShoppingListCount()I
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
    .locals 3

    .line 1096
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1097
    invoke-virtual {p0, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    .line 1101
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 1103
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 1104
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v1

    :cond_2
    return-object v0

    :cond_3
    :goto_0
    return-object v0
.end method

.method public getShoppingListEntryWithProductFamilyId(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
    .locals 4

    .line 971
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    if-nez p2, :cond_0

    goto :goto_1

    .line 975
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->shoppingListInfoMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    if-nez p1, :cond_1

    return-object v0

    .line 978
    :cond_1
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 979
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    const/4 v3, 0x1

    .line 980
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz p3, :cond_3

    .line 981
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    .line 982
    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    return-object v1

    :cond_4
    return-object v0

    :cond_5
    :goto_1
    return-object v0
.end method

.method public getShoppingListEntryWithProductId(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
    .locals 4

    .line 996
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    if-nez p2, :cond_0

    goto :goto_1

    .line 1000
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->shoppingListInfoMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    if-nez p1, :cond_1

    return-object v0

    .line 1003
    :cond_1
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 1004
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    const/4 v3, 0x1

    .line 1005
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz p3, :cond_3

    .line 1006
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    .line 1007
    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    return-object v1

    :cond_4
    return-object v0

    :cond_5
    :goto_1
    return-object v0
.end method

.method public getShoppingListIdFromEntry(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Ljava/lang/String;
    .locals 5

    .line 511
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->shoppingListInfoMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 512
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->shoppingListInfoMap:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    .line 513
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 514
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public getShoppingListSummaries()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;",
            ">;"
        }
    .end annotation

    .line 230
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 232
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    .line 233
    new-instance v3, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;

    invoke-direct {v3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;-><init>()V

    .line 234
    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    iput-object v4, v3, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;->shoppingListId:Ljava/lang/String;

    .line 235
    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->name:Ljava/lang/String;

    iput-object v4, v3, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;->title:Ljava/lang/String;

    .line 236
    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    iput v4, v3, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;->entryCount:I

    .line 237
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->createdTimeMs:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iput-wide v4, v3, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;->createdTimeMs:J

    .line 239
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 242
    :cond_0
    new-instance v1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$1;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public getShoppingListVersion(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 502
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 503
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityVersion:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string p1, "OFFLINE_DATA_TEMP_ENTITY_VERSION"

    :goto_0
    return-object p1
.end method

.method public getString(I)Ljava/lang/String;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->context:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public getSuggestionsForList(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1023
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->suggestionsRequest:Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;

    if-eqz v0, :cond_0

    .line 1024
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    const/4 v0, 0x0

    .line 1025
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->suggestionsRequest:Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;

    .line 1028
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->suggestionsRequest:Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;

    .line 1029
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->suggestionsRequest:Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;->shoppingListId:Ljava/lang/String;

    .line 1030
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;->searchString:Ljava/lang/String;

    .line 1032
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->suggestionsRequest:Lcom/shopkick/app/fetchers/api/skapi/GetShoppingListSuggestionsRequest;

    const/4 v5, 0x1

    sget-object v6, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v7, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v8, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    move-object v4, p0

    invoke-virtual/range {v1 .. v8}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method public getUniqueNumericString()Ljava/lang/String;
    .locals 5

    .line 1092
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isNewRequestCreatable()Z
    .locals 2

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->getModificationCount()I

    move-result v0

    sget v1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->MAX_PENDING_MODIFICATION_COUNT:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public maybeStartSync(Ljava/lang/Integer;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 203
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->scheduledSyncTrigger:Ljava/lang/Integer;

    .line 207
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->scheduledSyncTrigger:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->isRequestExist()Z

    move-result p1

    if-nez p1, :cond_1

    .line 208
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->scheduledSyncTrigger:Ljava/lang/Integer;

    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->syncList(Ljava/lang/Integer;)V

    :cond_1
    return-void
.end method

.method public maybeUpdateShoppingListVersionOnDisk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 494
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 495
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityVersion:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 496
    iput-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityVersion:Ljava/lang/String;

    .line 497
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->writeEntityByCopy(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    :cond_0
    return-void
.end method

.method public moveShoppingListEntry(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 820
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 821
    invoke-virtual {p0, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 822
    invoke-virtual {p0, p3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-eqz p1, :cond_5

    if-eqz p2, :cond_5

    if-eqz p3, :cond_5

    .line 825
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v0, "ShoppingListDataSource"

    .line 827
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "moveShoppingListEntry: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 830
    invoke-virtual {p0, p1, p3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 p1, 0x2

    .line 834
    invoke-direct {p0, p1, p3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->log(ILjava/lang/String;)V

    return-void

    .line 840
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 843
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->cloneEntryToMove(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v2

    const/4 v3, 0x0

    .line 844
    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    .line 847
    invoke-virtual {p0, p2, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->addShoppingListEntry(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v2

    .line 850
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    if-nez v0, :cond_3

    .line 852
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingList(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v0

    .line 851
    invoke-direct {p0, v0, p3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getChildShoppingListEntries(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;Ljava/lang/String;)Ljava/util/HashSet;

    move-result-object v0

    .line 854
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 856
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 858
    invoke-direct {p0, v3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->cloneEntryToMove(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v3

    .line 859
    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    .line 860
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 866
    :cond_3
    invoke-virtual {p0, p1, p3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->deleteShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)V

    .line 869
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 870
    invoke-virtual {p0, p2, p3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->addShoppingListEntry(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    goto :goto_1

    :cond_4
    return-void

    :cond_5
    :goto_2
    return-void
.end method

.method public onCategoryReadFromDisk(ILjava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    return-void

    .line 1387
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1388
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->shoppingListInfoMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 1390
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    .line 1391
    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    if-eqz v3, :cond_2

    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    :cond_2
    if-eqz v2, :cond_3

    .line 1395
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    iget-object v4, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityVersion:Ljava/lang/String;

    invoke-virtual {v3, v2, v4}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->maybeLoadOfflineRequestQueue(Ljava/lang/String;Ljava/lang/String;)V

    .line 1399
    :cond_3
    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    if-eqz v3, :cond_1

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->deleted:Ljava/lang/Boolean;

    if-eqz v3, :cond_4

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->deleted:Ljava/lang/Boolean;

    .line 1400
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_0

    .line 1402
    :cond_4
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->shoppingListInfoMap:Ljava/util/HashMap;

    iget-object v4, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    invoke-virtual {v3, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1403
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1407
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    new-instance v1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$3;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1419
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    .line 1420
    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    if-eqz v3, :cond_6

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    if-nez v3, :cond_7

    goto :goto_1

    .line 1422
    :cond_7
    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    new-instance v4, Lcom/shopkick/app/shoppinglists/SLUtils$ShoppingListEntryComparator;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-direct {v4, v1}, Lcom/shopkick/app/shoppinglists/SLUtils$ShoppingListEntryComparator;-><init>(Ljava/util/List;)V

    invoke-static {v3, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_1

    .line 1428
    :cond_8
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getSelectedShoppingListId()Ljava/lang/String;

    move-result-object v0

    .line 1429
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_c

    if-eqz v0, :cond_9

    invoke-virtual {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingList(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v0

    if-nez v0, :cond_c

    :cond_9
    const-wide/high16 v0, -0x8000000000000000L

    const/4 v3, 0x0

    move-wide v4, v0

    move v0, v3

    .line 1432
    :goto_2
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v3, v1, :cond_b

    .line 1433
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    if-eqz v1, :cond_a

    .line 1434
    iget-object v6, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->modifiedTimeMs:Ljava/lang/Long;

    if-eqz v6, :cond_a

    iget-object v6, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->modifiedTimeMs:Ljava/lang/Long;

    .line 1435
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v6, v6, v4

    if-lez v6, :cond_a

    .line 1436
    iget-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->modifiedTimeMs:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    move-wide v4, v0

    move v0, v3

    :cond_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 1440
    :cond_b
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->setSelectedShoppingListId(Ljava/lang/String;)V

    :cond_c
    const-string v0, "eventShoppingListReady"

    .line 1443
    invoke-direct {p0, v0, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEvent(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ShoppingListDataSource"

    .line 1445
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onCategoryReadFromDisk "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->shoppingListInfoMap:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "ShoppingListDataSource"

    .line 1454
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onEvent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 1456
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const/4 v0, 0x4

    const/4 v1, 0x1

    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string p2, "AppActivityManagerAppForegroundedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :sswitch_1
    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_1

    :sswitch_2
    const-string p2, "LogoutRequestFailure"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_1

    :sswitch_3
    const-string p2, "LogoutRequestSuccess"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_1

    :sswitch_4
    const-string p2, "AppActivityManagerAppBackgroundedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_3

    .line 1485
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->appPref:Lcom/shopkick/app/application/AppPreferences;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/AppPreferences;->setSelectedShoppingListId(Ljava/lang/String;)V

    .line 1488
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->clear()V

    .line 1491
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->fetchPopularItems()V

    .line 1494
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->syncList(Ljava/lang/Integer;)V

    .line 1497
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->startRequestCycle()V

    goto :goto_3

    .line 1478
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->stopRequestCycle()V

    goto :goto_3

    .line 1459
    :pswitch_2
    iget-boolean p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->isSessionStarted:Z

    if-nez p1, :cond_1

    const-string p1, "ShoppingListDataSource"

    const-string p2, "Load data from the disk"

    .line 1460
    invoke-static {p1, p2}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 1461
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->startShoppingList()V

    .line 1462
    iput-boolean v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->isSessionStarted:Z

    .line 1465
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->startRequestCycle()V

    .line 1467
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->isRequestExist()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1469
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->scheduledSyncTrigger:Ljava/lang/Integer;

    goto :goto_2

    .line 1471
    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->syncList(Ljava/lang/Integer;)V

    .line 1474
    :goto_2
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->fetchPopularItems()V

    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x55930ad7 -> :sswitch_4
        -0x494aad42 -> :sswitch_3
        -0x1ac3bbbb -> :sswitch_2
        0x44e6563 -> :sswitch_1
        0x3bb70f74 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onSyncFailed(I)V
    .locals 3

    const-string v0, "ShoppingListDataSource"

    .line 1363
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onSyncFailed "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x6

    if-ne p1, v0, :cond_0

    .line 1366
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->startShoppingList()V

    :cond_0
    return-void
.end method

.method public onSyncFinished(IZ)V
    .locals 3

    const-string v0, "ShoppingListDataSource"

    .line 1354
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onSyncFinished "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x6

    if-ne p1, p2, :cond_0

    .line 1356
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->startShoppingList()V

    const/4 p1, 0x1

    .line 1357
    iput-boolean p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->hasSyncSucceeded:Z

    :cond_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public renameShoppingList(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 373
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 376
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p2, 0x1

    .line 378
    invoke-direct {p0, p2, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->log(ILjava/lang/String;)V

    return-void

    .line 382
    :cond_0
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->name:Ljava/lang/String;

    .line 383
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iput-object p2, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->name:Ljava/lang/String;

    .line 384
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->writeEntityByCopy(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    const-string v0, "ShoppingListDataSource"

    .line 386
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "renameShoppingList: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {v0, p1, v1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestRenameShoppingList(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "eventShoppingListRenamed"

    .line 392
    invoke-direct {p0, p2, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEvent(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setApiManagerV2(Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 1

    .line 173
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 174
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->setApiManager(Lcom/shopkick/fetchers/api/APIManager;)V

    return-void
.end method

.method public setSelectedShoppingListId(Ljava/lang/String;)V
    .locals 1

    .line 290
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 292
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingList(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 293
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/AppPreferences;->setSelectedShoppingListId(Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public toggleShoppingListEntryCompletion(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 10

    .line 691
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 692
    invoke-virtual {p0, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p1, :cond_e

    if-nez p2, :cond_0

    goto/16 :goto_6

    .line 696
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object v0

    .line 697
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 701
    invoke-direct {p0, v2, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->log(ILjava/lang/String;)V

    return-void

    :cond_1
    const/4 v3, 0x2

    if-nez v1, :cond_2

    .line 707
    invoke-direct {p0, v3, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->log(ILjava/lang/String;)V

    return-void

    :cond_2
    const-string v4, "ShoppingListDataSource"

    .line 711
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v6, "toggleShoppingListEntryCompletion: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 715
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 718
    iget-object v5, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->priority:Ljava/lang/String;

    if-eqz p3, :cond_3

    .line 719
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_3
    const/4 v6, 0x0

    :goto_0
    if-eqz p3, :cond_4

    move v7, v3

    goto :goto_1

    :cond_4
    move v7, v2

    .line 720
    :goto_1
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    .line 721
    iput-object v6, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->priority:Ljava/lang/String;

    .line 722
    invoke-virtual {v4, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_6

    .line 725
    iget-object v7, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    if-nez v7, :cond_6

    .line 726
    iget-object v7, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    invoke-direct {p0, v7, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getChildShoppingListEntries(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;Ljava/lang/String;)Ljava/util/HashSet;

    move-result-object p2

    .line 728
    invoke-virtual {p2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 729
    iget-object v8, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    iget-object v9, v7, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {v8, v9}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    .line 731
    iget-object v8, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    iput-object v8, v7, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    .line 732
    iget-object v8, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->priority:Ljava/lang/String;

    iput-object v8, v7, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->priority:Ljava/lang/String;

    .line 733
    iget-object v7, v7, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p0, v7}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    if-nez p3, :cond_7

    .line 739
    iget-object p2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    if-eqz p2, :cond_7

    .line 740
    iget-object p2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    .line 741
    invoke-virtual {p0, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 740
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object p2

    if-eqz p2, :cond_7

    .line 742
    iget-object v7, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 743
    iget-object v7, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    iput-object v7, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    .line 744
    iget-object p2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v4, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 748
    :cond_7
    invoke-virtual {v4}, Ljava/util/HashSet;->size()I

    move-result p2

    if-le p2, v2, :cond_8

    const-string p2, "ShoppingListDataSource"

    .line 749
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v7, "toggleShoppingListEntryCompletion: updates "

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v1}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 753
    :cond_8
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->writeEntityByCopy(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    .line 755
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 757
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    if-eqz p3, :cond_9

    move v4, v2

    goto :goto_4

    :cond_9
    move v4, v3

    :goto_4
    if-eqz p3, :cond_a

    move v7, v3

    goto :goto_5

    :cond_a
    move v7, v2

    :goto_5
    invoke-virtual {v1, p1, v0, v4, v7}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestToggleShoppingListEntryCompletion(Ljava/lang/String;Ljava/lang/String;II)V

    if-nez v5, :cond_b

    if-eqz v6, :cond_c

    .line 764
    :cond_b
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-virtual {v1, p1, v0, v5, v6}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestChangeShoppingListEntryPriority(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    const-string v1, "eventShoppingListEntryCompletionToggled"

    .line 771
    invoke-direct {p0, v1, p1, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEntryEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_d
    return-void

    :cond_e
    :goto_6
    return-void
.end method

.method public updateShoppingListEntryId(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V
    .locals 4

    .line 932
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_8

    if-eqz p2, :cond_8

    if-nez p3, :cond_0

    goto :goto_4

    .line 936
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object v0

    .line 937
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->shoppingListInfoMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    if-eqz v0, :cond_7

    if-eqz v1, :cond_7

    .line 939
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    if-nez v2, :cond_1

    goto :goto_3

    .line 941
    :cond_1
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 942
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 943
    iput-object p3, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    if-eqz p4, :cond_3

    move-object v3, p4

    goto :goto_1

    .line 944
    :cond_3
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    :goto_1
    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    if-eqz p5, :cond_4

    move-object v3, p5

    goto :goto_2

    .line 945
    :cond_4
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    :goto_2
    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    goto :goto_0

    .line 947
    :cond_5
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 948
    iput-object p3, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    goto :goto_0

    .line 952
    :cond_6
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->writeEntityByCopy(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    .line 955
    iget-object p4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->tempIdToCanonicalIdMap:Ljava/util/HashMap;

    invoke-virtual {p4, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p4, "eventShoppingListChanged"

    .line 958
    invoke-direct {p0, p4, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEvent(Ljava/lang/String;Ljava/lang/String;)V

    const-string p4, "eventShoppingListEntryAddedFinished"

    .line 961
    invoke-direct {p0, p4, p1, p3, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEntryEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_7
    :goto_3
    return-void

    :cond_8
    :goto_4
    return-void
.end method

.method public updateShoppingListEntryQuantity(Ljava/lang/String;Ljava/lang/String;D)V
    .locals 4

    .line 649
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 650
    invoke-virtual {p0, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p1, :cond_5

    const-wide/16 v0, 0x0

    cmpl-double v0, p3, v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 654
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 p1, 0x2

    .line 658
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->log(ILjava/lang/String;)V

    return-void

    .line 663
    :cond_1
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    cmpl-double v1, v1, p3

    if-nez v1, :cond_2

    return-void

    .line 664
    :cond_2
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->unit:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->quantityUnits:Ljava/util/HashSet;

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->unit:Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 665
    :cond_3
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->unit:Ljava/lang/Integer;

    :cond_4
    const-string v1, "ShoppingListDataSource"

    .line 668
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "updateShoppingListEntryQuantity: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 672
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    move-result-object v1

    .line 673
    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    iput-object p3, v1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    .line 675
    iget-object p3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    iget-object p4, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    invoke-virtual {p3, p1, p2, p4, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestUpdateShoppingListEntryQuantity(Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/Quantity;Lcom/shopkick/app/fetchers/api/skapi/Quantity;)V

    .line 681
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    .line 682
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object p3

    invoke-direct {p0, p3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->writeEntityByCopy(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    const-string p3, "eventShoppingListInvalidated"

    .line 685
    invoke-direct {p0, p3, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEntryEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_5
    :goto_0
    return-void
.end method

.method public updateShoppingListEntryTitle(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 776
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 777
    invoke-virtual {p0, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSecuredId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p1, :cond_4

    if-eqz p2, :cond_4

    if-nez p3, :cond_0

    goto :goto_0

    .line 781
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object v0

    .line 782
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v1

    if-nez v0, :cond_1

    const/4 p2, 0x1

    .line 786
    invoke-direct {p0, p2, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->log(ILjava/lang/String;)V

    return-void

    :cond_1
    if-nez v1, :cond_2

    const/4 p1, 0x2

    .line 792
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->log(ILjava/lang/String;)V

    return-void

    .line 796
    :cond_2
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->title:Ljava/lang/String;

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    return-void

    .line 799
    :cond_3
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->requestManager:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->title:Ljava/lang/String;

    invoke-virtual {v2, p1, p2, v3, p3}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestUpdateShoppingListEntryTitle(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 805
    iput-object p3, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->title:Ljava/lang/String;

    .line 808
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->writeEntityByCopy(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    const-string v0, "eventShoppingListInvalidated"

    .line 811
    invoke-direct {p0, v0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEntryEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ShoppingListDataSource"

    .line 813
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "updateShoppingListEntryTitle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_4
    :goto_0
    return-void
.end method

.method public updateShoppingListId(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V
    .locals 5

    .line 453
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getSelectedShoppingListId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 454
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 455
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/application/AppPreferences;->setSelectedShoppingListId(Ljava/lang/String;)V

    .line 458
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getOfflineEntity(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object v0

    .line 459
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->shoppingListInfoMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    .line 462
    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object v1

    .line 463
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    const/4 v3, 0x6

    const-string v4, "SHOPPING_LIST_INFO"

    invoke-virtual {v2, p2, v3, v4}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntityKeyForId(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityKey:Ljava/lang/String;

    .line 466
    iput-object p5, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityVersion:Ljava/lang/String;

    .line 467
    iget-object p5, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iput-object p2, p5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    .line 468
    iget-object p5, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    iget-object p3, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->createdTimeMs:Ljava/lang/Long;

    :goto_0
    iput-object p3, p5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->createdTimeMs:Ljava/lang/Long;

    .line 470
    iget-object p3, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    if-eqz p4, :cond_2

    goto :goto_1

    :cond_2
    iget-object p4, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object p4, p4, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->modifiedTimeMs:Ljava/lang/Long;

    :goto_1
    iput-object p4, p3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->modifiedTimeMs:Ljava/lang/Long;

    .line 473
    iget-object p3, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    const/4 p4, 0x1

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    iput-object p4, p3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->deleted:Ljava/lang/Boolean;

    .line 475
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->writeEntityByCopy(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    .line 476
    invoke-direct {p0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->writeEntityByCopy(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    .line 478
    iget-object p3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p3

    .line 479
    iget-object p4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 480
    iget-object p4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->entityList:Ljava/util/ArrayList;

    invoke-virtual {p4, p3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 482
    iget-object p3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->shoppingListInfoMap:Ljava/util/HashMap;

    iget-object p4, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    invoke-virtual {p3, p2, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 486
    :cond_3
    iget-object p3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->tempIdToCanonicalIdMap:Ljava/util/HashMap;

    invoke-virtual {p3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p3, "eventShoppingListCreatedFinished"

    .line 489
    invoke-direct {p0, p3, p2, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
