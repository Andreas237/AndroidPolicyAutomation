.class public Lcom/microblink/internal/services/lookup/StoreLookupRequest;
.super Ljava/lang/Object;


# instance fields
.field private address:Ljava/lang/String;

.field private apiKey:Ljava/lang/String;

.field private bannerId:I

.field private location:Lcom/microblink/internal/Location;

.field private name:Ljava/lang/String;

.field private phoneNumber:Lcom/microblink/internal/phone/PhoneNumber;

.field private radius:I

.field private rank:Ljava/lang/String;

.field private rawResults:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private storeNumber:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->bannerId:I

    return-void
.end method

.method public constructor <init>(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)V
    .locals 1
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->bannerId:I

    iget-object v0, p1, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->apiKey:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->apiKey:Ljava/lang/String;

    iget-object v0, p1, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->phoneNumber:Lcom/microblink/internal/phone/PhoneNumber;

    iput-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->phoneNumber:Lcom/microblink/internal/phone/PhoneNumber;

    iget-object v0, p1, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->storeNumber:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->storeNumber:Ljava/lang/String;

    iget-object v0, p1, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->address:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->address:Ljava/lang/String;

    iget v0, p1, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->radius:I

    iput v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->radius:I

    iget v0, p1, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->bannerId:I

    iput v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->bannerId:I

    iget-object v0, p1, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->location:Lcom/microblink/internal/Location;

    iput-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->location:Lcom/microblink/internal/Location;

    iget-object v0, p1, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rank:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rank:Ljava/lang/String;

    iget-object v0, p1, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->type:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->type:Ljava/lang/String;

    iget-object p1, p1, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rawResults:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rawResults:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public address(Ljava/lang/String;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->address:Ljava/lang/String;

    return-object p0
.end method

.method public address()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->address:Ljava/lang/String;

    return-object v0
.end method

.method public apiKey(Ljava/lang/String;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->apiKey:Ljava/lang/String;

    return-object p0
.end method

.method public apiKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->apiKey:Ljava/lang/String;

    return-object v0
.end method

.method public bannerId()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->bannerId:I

    return v0
.end method

.method public bannerId(I)Lcom/microblink/internal/services/lookup/StoreLookupRequest;
    .locals 0

    iput p1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->bannerId:I

    return-object p0
.end method

.method public location()Lcom/microblink/internal/Location;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->location:Lcom/microblink/internal/Location;

    return-object v0
.end method

.method public location(Lcom/microblink/internal/Location;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->location:Lcom/microblink/internal/Location;

    return-object p0
.end method

.method public name(Ljava/lang/String;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->name:Ljava/lang/String;

    return-object p0
.end method

.method public name()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->name:Ljava/lang/String;

    return-object v0
.end method

.method public phoneNumber()Lcom/microblink/internal/phone/PhoneNumber;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->phoneNumber:Lcom/microblink/internal/phone/PhoneNumber;

    return-object v0
.end method

.method public phoneNumber(Lcom/microblink/internal/phone/PhoneNumber;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->phoneNumber:Lcom/microblink/internal/phone/PhoneNumber;

    return-object p0
.end method

.method public radius()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->radius:I

    return v0
.end method

.method public radius(I)Lcom/microblink/internal/services/lookup/StoreLookupRequest;
    .locals 0

    iput p1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->radius:I

    return-object p0
.end method

.method public rank(Ljava/lang/String;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rank:Ljava/lang/String;

    return-object p0
.end method

.method public rank()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rank:Ljava/lang/String;

    return-object v0
.end method

.method public rawResults(Ljava/util/ArrayList;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/microblink/internal/services/lookup/StoreLookupRequest;"
        }
    .end annotation

    iput-object p1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rawResults:Ljava/util/ArrayList;

    return-object p0
.end method

.method public rawResults()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rawResults:Ljava/util/ArrayList;

    return-object v0
.end method

.method public storeNumber(Ljava/lang/String;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->storeNumber:Ljava/lang/String;

    return-object p0
.end method

.method public storeNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->storeNumber:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "StoreLookupRequest{apiKey=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->apiKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", number="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->phoneNumber:Lcom/microblink/internal/phone/PhoneNumber;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", storeNumber=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->storeNumber:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", radius="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->radius:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", address=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->address:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", bannerId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->bannerId:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", location="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->location:Lcom/microblink/internal/Location;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", rank=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rank:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", type=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->type:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", name=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->name:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", rawResults="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rawResults:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public type(Ljava/lang/String;)Lcom/microblink/internal/services/lookup/StoreLookupRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->type:Ljava/lang/String;

    return-object p0
.end method

.method public type()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->type:Ljava/lang/String;

    return-object v0
.end method
