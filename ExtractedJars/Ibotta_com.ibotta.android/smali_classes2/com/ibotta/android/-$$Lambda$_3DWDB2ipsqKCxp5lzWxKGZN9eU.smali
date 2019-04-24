.class public final synthetic Lcom/ibotta/android/-$$Lambda$_3DWDB2ipsqKCxp5lzWxKGZN9eU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final synthetic INSTANCE:Lcom/ibotta/android/-$$Lambda$_3DWDB2ipsqKCxp5lzWxKGZN9eU;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/-$$Lambda$_3DWDB2ipsqKCxp5lzWxKGZN9eU;

    invoke-direct {v0}, Lcom/ibotta/android/-$$Lambda$_3DWDB2ipsqKCxp5lzWxKGZN9eU;-><init>()V

    sput-object v0, Lcom/ibotta/android/-$$Lambda$_3DWDB2ipsqKCxp5lzWxKGZN9eU;->INSTANCE:Lcom/ibotta/android/-$$Lambda$_3DWDB2ipsqKCxp5lzWxKGZN9eU;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/listview/IbottaListViewHolderFactoryImpl;

    check-cast p1, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/IbottaListViewHolderFactoryImpl;-><init>(Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;)V

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListViewHolderFactory;

    return-object v0
.end method
