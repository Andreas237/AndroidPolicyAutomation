.class synthetic Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView$1;
.super Ljava/lang/Object;
.source "BaseOfferCardView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$android$views$components$Visibility:[I

.field static final synthetic $SwitchMap$com$ibotta$android$views$content$ScaleType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 194
    invoke-static {}, Lcom/ibotta/android/views/components/Visibility;->values()[Lcom/ibotta/android/views/components/Visibility;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView$1;->$SwitchMap$com$ibotta$android$views$components$Visibility:[I

    const/4 v0, 0x1

    :try_start_0
    sget-object v1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView$1;->$SwitchMap$com$ibotta$android$views$components$Visibility:[I

    sget-object v2, Lcom/ibotta/android/views/components/Visibility;->GONE:Lcom/ibotta/android/views/components/Visibility;

    invoke-virtual {v2}, Lcom/ibotta/android/views/components/Visibility;->ordinal()I

    move-result v2

    aput v0, v1, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v1, 0x2

    :try_start_1
    sget-object v2, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView$1;->$SwitchMap$com$ibotta$android$views$components$Visibility:[I

    sget-object v3, Lcom/ibotta/android/views/components/Visibility;->INVISIBLE:Lcom/ibotta/android/views/components/Visibility;

    invoke-virtual {v3}, Lcom/ibotta/android/views/components/Visibility;->ordinal()I

    move-result v3

    aput v1, v2, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v2, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView$1;->$SwitchMap$com$ibotta$android$views$components$Visibility:[I

    sget-object v3, Lcom/ibotta/android/views/components/Visibility;->VISIBLE:Lcom/ibotta/android/views/components/Visibility;

    invoke-virtual {v3}, Lcom/ibotta/android/views/components/Visibility;->ordinal()I

    move-result v3

    const/4 v4, 0x3

    aput v4, v2, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 147
    :catch_2
    invoke-static {}, Lcom/ibotta/android/views/content/ScaleType;->values()[Lcom/ibotta/android/views/content/ScaleType;

    move-result-object v2

    array-length v2, v2

    new-array v2, v2, [I

    sput-object v2, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView$1;->$SwitchMap$com$ibotta$android$views$content$ScaleType:[I

    :try_start_3
    sget-object v2, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView$1;->$SwitchMap$com$ibotta$android$views$content$ScaleType:[I

    sget-object v3, Lcom/ibotta/android/views/content/ScaleType;->FIT_CENTER:Lcom/ibotta/android/views/content/ScaleType;

    invoke-virtual {v3}, Lcom/ibotta/android/views/content/ScaleType;->ordinal()I

    move-result v3

    aput v0, v2, v3
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView$1;->$SwitchMap$com$ibotta$android$views$content$ScaleType:[I

    sget-object v2, Lcom/ibotta/android/views/content/ScaleType;->CENTER_CROP:Lcom/ibotta/android/views/content/ScaleType;

    invoke-virtual {v2}, Lcom/ibotta/android/views/content/ScaleType;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    return-void
.end method
