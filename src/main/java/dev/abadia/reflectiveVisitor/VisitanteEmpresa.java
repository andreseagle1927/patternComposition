package dev.abadia.reflectiveVisitor;

public interface VisitanteEmpresa
{
    void visita(EmpresaSinFilial empresa);
    void visita(EmpresaMadre empresa);
}
