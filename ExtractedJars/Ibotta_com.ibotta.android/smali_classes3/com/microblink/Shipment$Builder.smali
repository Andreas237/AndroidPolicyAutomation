.class public final Lcom/microblink/Shipment$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/Shipment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private products:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;"
        }
    .end annotation
.end field

.field private status:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/Shipment$Builder;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/microblink/Shipment$Builder;->status:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/Shipment$Builder;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/microblink/Shipment$Builder;->products:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final build()Lcom/microblink/Shipment;
    .locals 1

    new-instance v0, Lcom/microblink/Shipment;

    invoke-direct {v0, p0}, Lcom/microblink/Shipment;-><init>(Lcom/microblink/Shipment$Builder;)V

    return-object v0
.end method

.method public final products(Ljava/util/List;)Lcom/microblink/Shipment$Builder;
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;)",
            "Lcom/microblink/Shipment$Builder;"
        }
    .end annotation

    iput-object p1, p0, Lcom/microblink/Shipment$Builder;->products:Ljava/util/List;

    return-object p0
.end method

.method public final status(Ljava/lang/String;)Lcom/microblink/Shipment$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/microblink/Shipment$Builder;->status:Ljava/lang/String;

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Builder{status=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/Shipment$Builder;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", products="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/Shipment$Builder;->products:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
