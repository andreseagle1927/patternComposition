package dev.abadia.Multicast;

public interface ReceptorAbstracto<TMensaje extends MensajeAbstracto>
{
    public void recibe(TMensaje mensaje);
}