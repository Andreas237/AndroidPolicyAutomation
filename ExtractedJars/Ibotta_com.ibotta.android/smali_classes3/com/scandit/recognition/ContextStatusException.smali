.class public Lcom/scandit/recognition/ContextStatusException;
.super Ljava/lang/RuntimeException;
.source "ContextStatusException.java"


# instance fields
.field private final code:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 15
    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 17
    iput p1, p0, Lcom/scandit/recognition/ContextStatusException;->code:I

    return-void
.end method


# virtual methods
.method public getErrorCode()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/scandit/recognition/ContextStatusException;->code:I

    return v0
.end method
