.class public final Lcom/ibotta/android/search/Barcode;
.super Lcom/ibotta/android/search/ButtonType;
.source "SuggestedSearchItemCtaButtonReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/ibotta/android/search/Barcode;",
        "Lcom/ibotta/android/search/ButtonType;",
        "()V",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/ibotta/android/search/Barcode;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    new-instance v0, Lcom/ibotta/android/search/Barcode;

    invoke-direct {v0}, Lcom/ibotta/android/search/Barcode;-><init>()V

    sput-object v0, Lcom/ibotta/android/search/Barcode;->INSTANCE:Lcom/ibotta/android/search/Barcode;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, v0}, Lcom/ibotta/android/search/ButtonType;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
