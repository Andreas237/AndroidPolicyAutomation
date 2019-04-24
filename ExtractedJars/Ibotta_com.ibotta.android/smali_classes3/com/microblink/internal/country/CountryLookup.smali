.class public Lcom/microblink/internal/country/CountryLookup;
.super Ljava/lang/Object;


# instance fields
.field private countryCode:Ljava/lang/String;

.field private csv:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private phoneNumber:Ljava/lang/String;

.field private streetAddress:Ljava/lang/String;

.field private taxId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public countryCode(Ljava/lang/String;)Lcom/microblink/internal/country/CountryLookup;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/country/CountryLookup;->countryCode:Ljava/lang/String;

    return-object p0
.end method

.method public countryCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/country/CountryLookup;->countryCode:Ljava/lang/String;

    return-object v0
.end method

.method public csv(Ljava/util/ArrayList;)Lcom/microblink/internal/country/CountryLookup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/microblink/internal/country/CountryLookup;"
        }
    .end annotation

    iput-object p1, p0, Lcom/microblink/internal/country/CountryLookup;->csv:Ljava/util/ArrayList;

    return-object p0
.end method

.method public csv()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/country/CountryLookup;->csv:Ljava/util/ArrayList;

    return-object v0
.end method

.method public phoneNumber(Ljava/lang/String;)Lcom/microblink/internal/country/CountryLookup;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/country/CountryLookup;->phoneNumber:Ljava/lang/String;

    return-object p0
.end method

.method public phoneNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/country/CountryLookup;->phoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public streetAddress(Ljava/lang/String;)Lcom/microblink/internal/country/CountryLookup;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/country/CountryLookup;->streetAddress:Ljava/lang/String;

    return-object p0
.end method

.method public streetAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/country/CountryLookup;->streetAddress:Ljava/lang/String;

    return-object v0
.end method

.method public taxId(Ljava/lang/String;)Lcom/microblink/internal/country/CountryLookup;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/country/CountryLookup;->taxId:Ljava/lang/String;

    return-object p0
.end method

.method public taxId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/country/CountryLookup;->taxId:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CountryLookup{countryCode=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/country/CountryLookup;->countryCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", taxId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/country/CountryLookup;->taxId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", phoneNumber=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/country/CountryLookup;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", streetAddress=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/country/CountryLookup;->streetAddress:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", csv="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/country/CountryLookup;->csv:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
