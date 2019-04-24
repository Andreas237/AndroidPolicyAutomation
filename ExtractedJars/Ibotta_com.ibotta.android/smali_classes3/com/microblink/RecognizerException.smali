.class public Lcom/microblink/RecognizerException;
.super Lcom/microblink/ReceiptSdkException;


# static fields
.field static final serialVersionUID:J = 0x1L


# instance fields
.field private results:Lcom/microblink/RecognizerResult;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/ReceiptSdkException;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/microblink/ReceiptSdkException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/microblink/RecognizerResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/microblink/ReceiptSdkException;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/microblink/RecognizerException;->results:Lcom/microblink/RecognizerResult;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/microblink/ReceiptSdkException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/microblink/ReceiptSdkException;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public getResults()Lcom/microblink/RecognizerResult;
    .locals 1

    iget-object v0, p0, Lcom/microblink/RecognizerException;->results:Lcom/microblink/RecognizerResult;

    return-object v0
.end method
