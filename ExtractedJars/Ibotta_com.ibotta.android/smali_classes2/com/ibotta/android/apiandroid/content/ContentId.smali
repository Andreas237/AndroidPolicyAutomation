.class public abstract Lcom/ibotta/android/apiandroid/content/ContentId;
.super Ljava/lang/Object;
.source "ContentId.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/apiandroid/content/ContentId$ContentType;
    }
.end annotation


# static fields
.field public static final BONUS:I = 0x5

.field public static final BUYABLE_GIFT_CARD:I = 0x8

.field public static final CATEGORY:I = 0x9

.field public static final DEAL:I = 0x4

.field public static EMPTY:Lcom/ibotta/android/apiandroid/content/ContentId; = null

.field public static final FEATURE:I = 0x7

.field public static final FEATURED_RETAILER:I = 0x6

.field public static final NULL:I = 0x0

.field public static final OFFER:I = 0x1

.field public static final PRODUCT:I = 0x3

.field public static final RETAILER:I = 0x2


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    .line 32
    invoke-static {v0, v0}, Lcom/ibotta/android/apiandroid/content/ContentId;->create(II)Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/apiandroid/content/ContentId;->EMPTY:Lcom/ibotta/android/apiandroid/content/ContentId;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(II)Lcom/ibotta/android/apiandroid/content/ContentId;
    .locals 2

    .line 43
    invoke-static {p0}, Lcom/ibotta/android/apiandroid/content/ContentId;->isStringId(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 47
    new-instance v0, Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;

    const-string v1, ""

    invoke-direct {v0, p0, p1, v1}, Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;-><init>(IILjava/lang/String;)V

    return-object v0

    .line 44
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Attempt to assign a string ID to an int ID type contentType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static create(ILjava/lang/String;)Lcom/ibotta/android/apiandroid/content/ContentId;
    .locals 2

    .line 51
    invoke-static {p0}, Lcom/ibotta/android/apiandroid/content/ContentId;->isStringId(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    new-instance v0, Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lcom/ibotta/android/apiandroid/content/AutoValue_ContentId;-><init>(IILjava/lang/String;)V

    return-object v0

    .line 52
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Attempt to assign an int ID to an string ID type: contentType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static isStringId(I)Z
    .locals 1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public abstract getIdType()I
.end method

.method public getIntId()I
    .locals 3

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIdType()I

    move-result v0

    invoke-static {v0}, Lcom/ibotta/android/apiandroid/content/ContentId;->isStringId(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 63
    invoke-virtual {p0}, Lcom/ibotta/android/apiandroid/content/ContentId;->getInternalIntId()I

    move-result v0

    return v0

    .line 60
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Requesting an int ID from a String ID representation: contentType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIdType()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected abstract getInternalIntId()I
.end method

.method protected abstract getInternalStringId()Ljava/lang/String;
.end method

.method public getStringId()Ljava/lang/String;
    .locals 3

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIdType()I

    move-result v0

    invoke-static {v0}, Lcom/ibotta/android/apiandroid/content/ContentId;->isStringId(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/android/apiandroid/content/ContentId;->getInternalStringId()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 68
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Requesting a String ID from an int ID representation: contentType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    invoke-virtual {p0}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIdType()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
