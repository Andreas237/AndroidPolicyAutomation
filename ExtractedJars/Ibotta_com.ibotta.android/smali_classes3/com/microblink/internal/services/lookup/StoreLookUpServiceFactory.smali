.class public final Lcom/microblink/internal/services/lookup/StoreLookUpServiceFactory;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/internal/services/lookup/StoreLookUpServiceFactory$ServiceType;
    }
.end annotation


# static fields
.field public static final BLINK:I = 0x2

.field public static final GOOGLE:I = 0x0

.field public static final YELP:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(ILjava/lang/Class;)Lcom/microblink/internal/services/lookup/StoreLookUpService;
    .locals 0
    .param p1    # Ljava/lang/Class;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/microblink/internal/services/lookup/StoreLookUpService;",
            ">(I",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    packed-switch p0, :pswitch_data_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :pswitch_0
    new-instance p0, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;

    invoke-direct {p0}, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;-><init>()V

    :goto_0
    invoke-virtual {p1, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/microblink/internal/services/lookup/StoreLookUpService;

    return-object p0

    :pswitch_1
    new-instance p0, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;

    invoke-direct {p0}, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;-><init>()V

    goto :goto_0

    :pswitch_2
    new-instance p0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;

    invoke-direct {p0}, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;-><init>()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
