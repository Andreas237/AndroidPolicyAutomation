.class public Lcom/scandit/barcodepicker/ocr/CharacterSet;
.super Ljava/lang/Object;
.source "CharacterSet.java"


# instance fields
.field private mCharacters:[C


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 10
    new-array v0, v0, [C

    iput-object v0, p0, Lcom/scandit/barcodepicker/ocr/CharacterSet;->mCharacters:[C

    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    iput-object p1, p0, Lcom/scandit/barcodepicker/ocr/CharacterSet;->mCharacters:[C

    return-void
.end method


# virtual methods
.method public getCharacters()[C
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/scandit/barcodepicker/ocr/CharacterSet;->mCharacters:[C

    return-object v0
.end method
