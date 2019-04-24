.class public Lcom/microblink/SdkNotInitializedException;
.super Lcom/microblink/ReceiptSdkException;


# static fields
.field static final serialVersionUID:J = 0x1L


# instance fields
.field private isNativeLibraryLoaded:Z

.field private nativeError:Ljava/lang/Error;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/microblink/ReceiptSdkException;-><init>(Ljava/lang/String;)V

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

.method public constructor <init>(ZLjava/lang/String;Ljava/lang/Error;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/microblink/SdkNotInitializedException;-><init>(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/microblink/SdkNotInitializedException;->isNativeLibraryLoaded:Z

    iput-object p3, p0, Lcom/microblink/SdkNotInitializedException;->nativeError:Ljava/lang/Error;

    return-void
.end method


# virtual methods
.method public isNativeLibraryLoaded()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/SdkNotInitializedException;->isNativeLibraryLoaded:Z

    return v0
.end method

.method public nativeError()Ljava/lang/Error;
    .locals 1

    iget-object v0, p0, Lcom/microblink/SdkNotInitializedException;->nativeError:Ljava/lang/Error;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SdkNotInitializedException{, isNativeLibraryLoaded="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/microblink/SdkNotInitializedException;->isNativeLibraryLoaded:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", nativeError="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/SdkNotInitializedException;->nativeError:Ljava/lang/Error;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
