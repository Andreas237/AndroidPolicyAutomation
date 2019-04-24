.class public Lcom/microblink/internal/SizeCompat;
.super Ljava/lang/Object;


# instance fields
.field private final height:I

.field private final width:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/microblink/internal/SizeCompat;->width:I

    iput p2, p0, Lcom/microblink/internal/SizeCompat;->height:I

    return-void
.end method

.method public static create(II)Lcom/microblink/internal/SizeCompat;
    .locals 1

    new-instance v0, Lcom/microblink/internal/SizeCompat;

    invoke-direct {v0, p0, p1}, Lcom/microblink/internal/SizeCompat;-><init>(II)V

    return-object v0
.end method


# virtual methods
.method public height()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/SizeCompat;->height:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SizeCompat{width="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/microblink/internal/SizeCompat;->width:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/internal/SizeCompat;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public width()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/SizeCompat;->width:I

    return v0
.end method
