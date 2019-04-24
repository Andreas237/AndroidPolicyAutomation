.class public abstract Lcom/ibotta/api/model/content/CustomerNode$Builder;
.super Ljava/lang/Object;
.source "CustomerNode.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/content/CustomerNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/api/model/content/CustomerNode;
.end method

.method public abstract favoriteRetailers(Ljava/util/List;)Lcom/ibotta/api/model/content/CustomerNode$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/RetailerContent;",
            ">;)",
            "Lcom/ibotta/api/model/content/CustomerNode$Builder;"
        }
    .end annotation
.end method
