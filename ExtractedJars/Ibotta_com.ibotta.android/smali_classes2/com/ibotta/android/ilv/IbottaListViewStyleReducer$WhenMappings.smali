.class public final synthetic Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I

.field public static final synthetic $EnumSwitchMapping$2:[I

.field public static final synthetic $EnumSwitchMapping$3:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 10

    invoke-static {}, Lcom/ibotta/android/ilv/ListType;->values()[Lcom/ibotta/android/ilv/ListType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->RETAILER_SIDE_SCROLLER:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->OFFER_SIDE_SCROLLER:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    const/4 v3, 0x2

    aput v3, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->SUGGESTED_SEARCH_TERMS:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    const/4 v4, 0x3

    aput v4, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->MODULES:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    const/4 v5, 0x4

    aput v5, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->OFFER_TAG_SEARCH:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    const/4 v6, 0x5

    aput v6, v0, v1

    invoke-static {}, Lcom/ibotta/android/ilv/ListType;->values()[Lcom/ibotta/android/ilv/ListType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->GALLERY:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->MODULES:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    aput v3, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->OFFER_TAG_SEARCH:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    aput v4, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->SEARCH:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    aput v5, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->VERTICAL:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    aput v6, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->SUGGESTED_SEARCH_TERMS:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    const/4 v7, 0x6

    aput v7, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->RETAILER_SIDE_SCROLLER:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    const/4 v8, 0x7

    aput v8, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->OFFER_SIDE_SCROLLER:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    const/16 v9, 0x8

    aput v9, v0, v1

    invoke-static {}, Lcom/ibotta/android/ilv/ListType;->values()[Lcom/ibotta/android/ilv/ListType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->GALLERY:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->MODULES:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    aput v3, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->OFFER_TAG_SEARCH:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    aput v4, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->SEARCH:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    aput v5, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->VERTICAL:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    aput v6, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->SUGGESTED_SEARCH_TERMS:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    aput v7, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->RETAILER_SIDE_SCROLLER:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    aput v8, v0, v1

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->OFFER_SIDE_SCROLLER:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    aput v9, v0, v1

    invoke-static {}, Lcom/ibotta/android/ilv/ListType;->values()[Lcom/ibotta/android/ilv/ListType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$3:[I

    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$3:[I

    sget-object v1, Lcom/ibotta/android/ilv/ListType;->OFFER_SIDE_SCROLLER:Lcom/ibotta/android/ilv/ListType;

    invoke-virtual {v1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    aput v2, v0, v1

    return-void
.end method
