.class public Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;
.super Ljava/lang/Object;
.source "IbottaApolloLogger.java"

# interfaces
.implements Lcom/apollographql/apollo/Logger;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final debugLogging:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;->debugLogging:Z

    return-void
.end method


# virtual methods
.method public varargs log(ILjava/lang/String;Lcom/apollographql/apollo/api/internal/Optional;[Ljava/lang/Object;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Lcom/apollographql/apollo/api/internal/Optional;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p4    # [Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lcom/apollographql/apollo/api/internal/Optional<",
            "Ljava/lang/Throwable;",
            ">;[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const/4 p3, 0x3

    if-eq p1, p3, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p3, 0x6

    goto :goto_0

    :pswitch_1
    const/4 p3, 0x5

    .line 44
    :cond_0
    :goto_0
    iget-boolean p1, p0, Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;->debugLogging:Z

    if-eqz p1, :cond_2

    .line 45
    array-length p1, p4

    if-lez p1, :cond_1

    .line 46
    invoke-static {p3, p2, p4}, Ltimber/log/Timber;->log(ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 48
    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p3, p2, p1}, Ltimber/log/Timber;->log(ILjava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
