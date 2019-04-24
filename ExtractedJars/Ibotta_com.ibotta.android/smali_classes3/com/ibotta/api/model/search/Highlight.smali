.class public abstract Lcom/ibotta/api/model/search/Highlight;
.super Ljava/lang/Object;
.source "Highlight.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# static fields
.field public static EMPTY:Lcom/ibotta/api/model/search/Highlight;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    .line 11
    invoke-static {v0, v0}, Lcom/ibotta/api/model/search/Highlight;->create(II)Lcom/ibotta/api/model/search/Highlight;

    move-result-object v0

    sput-object v0, Lcom/ibotta/api/model/search/Highlight;->EMPTY:Lcom/ibotta/api/model/search/Highlight;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(II)Lcom/ibotta/api/model/search/Highlight;
    .locals 1

    .line 17
    new-instance v0, Lcom/ibotta/api/model/search/AutoValue_Highlight;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/api/model/search/AutoValue_Highlight;-><init>(II)V

    return-object v0
.end method


# virtual methods
.method public abstract getLength()I
.end method

.method public abstract getOffset()I
.end method
